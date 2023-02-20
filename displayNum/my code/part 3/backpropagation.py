import torch 
from torch import nn 
import torch.nn.functional as F 
from torchvision import datasets, transforms
from torch import optim

import matplotlib.pyplot as plt 
import helper2

from PIL import Image




from six.moves import urllib 

opener = urllib.request.build_opener()
opener.addheaders = [('User-agent', 'Mozilla/5.0')]
urllib.request.install_opener(opener)

# img = Image.open("output.png")



# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,), (0.5,)),
                              ])
# Download and load the training data

trainset = datasets.MNIST('~/.pytorch/MNIST_data/', download=True, train=True, transform=transform)
trainloader = torch.utils.data.DataLoader(trainset, batch_size=64, shuffle=True)


# Build a feed-forward network
model = nn.Sequential(nn.Linear(784, 128),
                      nn.ReLU(),
                      nn.Linear(128, 64),
                      nn.ReLU(),
                      nn.Linear(64, 10), 
                      nn.LogSoftmax(dim=1))
# Define the loss 
criterion = nn.NLLLoss()
# Optimizers require the parameters to optimize and a learning rate 
optimizer = optim.SGD(model.parameters(), lr=0.01)

epochs = 5
for i in range(epochs): 
    running_loss = 0
    for images, labels in trainloader: 
        # Flatten MNIST images into a 784 long vector 
        images = images.view(images.shape[0], -1)
        
        optimizer.zero_grad()
        output = model.forward(images)
        loss = criterion(output, labels)
        loss.backward()
        optimizer.step()    

        running_loss = loss.item()
    else: 
        print(f"Training loss: {running_loss/len(trainloader)}")



dataiter = iter(trainloader)
images, labels = next(dataiter)

img = images[0].view(1, 784)
print(img.size)

# Turn off gradients to speed up this part 
with torch.no_grad(): 
    logps = model(img)
    # TODO: Give output.png as a tensor to the model here
    


# Output of the network are log-probabilities, need to take exponential for probabilities

ps = torch.exp(logps)
helper2.view_classify(img.view(1, 28, 28), ps)

