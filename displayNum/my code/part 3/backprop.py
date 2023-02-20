import torch 
from torch import nn 
import torch.nn.functional as F 
from torchvision import datasets, transforms
from torch import optim

import matplotlib.pyplot as plt 
import helper2

from PIL import Image




from six.moves import urllib 

# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,), (0.5,)),
                              ])

model = torch.load("/Users/Atiksh/OneDrive/Desktop/Coding/AI/deep-learning-v2-pytorch/my code/part 3/myModel.pth")
model.eval()

trainset = datasets.MNIST('~/.pytorch/MNIST_data/', download=True, train=True, transform=transform)
trainloader = torch.utils.data.DataLoader(trainset, batch_size=64, shuffle=True)

dataiter = iter(trainloader)
images, labels = next(dataiter)

img = images[0].view(1, 784)

new_size = (28, 28)
imgOriginal = Image.open('/Users/Atiksh/OneDrive/Desktop/Coding/PACE_Java/output.png')
imgResized = imgOriginal.resize(new_size)
# print(imgResized.size)
imgTensor = transform(imgResized)
imgTensor = imgTensor.unsqueeze_(0)
imgTensor = imgTensor.resize_(1, 784)
print(imgTensor.shape)

imgResized.show()

# print(imgTensor)
# print(img)




# Turn off gradients to speed up this part 
with torch.no_grad(): 
    logps = model(img)
    # TODO: Give output.png as a tensor to the model here
    


# Output of the network are log-probabilities, need to take exponential for probabilities

ps = torch.exp(logps)
helper2.view_classify(img.view(1, 28, 28), ps)

