import torch
from torchvision import transforms, datasets
from torch import nn; 
import helper2
import torch.nn.functional as F
from torch import optim
import matplotlib.pyplot as plt 




model = torch.load("/Users/Atiksh/OneDrive/Desktop/Coding/AI/deep-learning-v2-pytorch/my code/part 4/myModel.pth")
model.eval()
# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,), (0.5,))])

# Download and load the training data
trainset = datasets.FashionMNIST('~/.pytorch/F_MNIST_data/', download=True, train=True, transform=transform)
trainloader = torch.utils.data.DataLoader(trainset, batch_size=64, shuffle=True)

# Download and load the test data
testset = datasets.FashionMNIST('~/.pytorch/F_MNIST_data/', download=True, train=False, transform=transform)
testloader = torch.utils.data.DataLoader(testset, batch_size=64, shuffle=True)

dataiter = iter(trainloader)
images, labels = next(dataiter)
img = images[0]
# Convert 2D image to 1D vector
img = img.resize_(1, 784)

with torch.no_grad(): 
    logps = model(img)
    # TODO: Give output.png as a tensor to the model here
    


# Output of the network are log-probabilities, need to take exponential for probabilities

ps = torch.exp(logps)
helper2.view_classify(img.view(1, 28, 28), ps, version='Fashion')

