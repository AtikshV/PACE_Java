### Run this cell
import torch 

# Import necessary packages

# %matplotlib inline
# %config InlineBackend.figure_format = 'retina'

import numpy as np
import torch

# import helper # No module named 'helper'

import matplotlib.pyplot as plt

# The MNIST datasets are hosted on yann.lecun.com that has moved under CloudFlare protection
# Run this script to enable the datasets download
# Reference: https://github.com/pytorch/vision/issues/1938

from six.moves import urllib
opener = urllib.request.build_opener()
opener.addheaders = [('User-agent', 'Mozilla/5.0')]
urllib.request.install_opener(opener)


from torchvision import datasets, transforms

# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                              transforms.Normalize((0.5,), (0.5,)),
                              ])

# Download and load the training data
trainset = datasets.MNIST('~/.pytorch/MNIST_data/', download=True, train=True, transform=transform)
trainloader = torch.utils.data.DataLoader(trainset, batch_size=64, shuffle=True)


dataiter = iter(trainloader)
images, labels = next(dataiter)
# print(type(images))
# print(images.shape)
# print(labels.shape)

plt.imshow(images[1].numpy().squeeze(), cmap='Greys_r');
plt.show() # prints the image

def activation(x): # sigmoid 
        return 1/(1+torch.exp(-x))


inputs = images.view(images.shape[0] , -1) # shortcut way to flatten tensor without knowing dimensions
# images.shape[0] grabs the batch size (64)
# inputs = images.view(64, 784)

w1 = torch.randn(784, 256)
w2 = torch.randn(256, 10)

b1 = torch.randn(1, 256)
b2 = torch.randn(1, 10)

h = activation(torch.mm(inputs, w1) + b1)

out = activation(torch.mm(h, w2) + b2)

print(out.shape)

def softmax(x): #softmax function 
    return(torch.exp(x)/torch.sum(torch.exp(x), dim=1).view(-1, 1))


probabilities = softmax(out)

print(probabilities.shape)
print(probabilities.sum(dim=1))
