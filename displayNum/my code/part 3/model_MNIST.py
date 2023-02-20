import torch 
from torch import nn 
import torch.nn.functional as F 
from torchvision import datasets, transforms
from torch import optim

import matplotlib.pyplot as plt 
import helper2





from six.moves import urllib 

opener = urllib.request.build_opener()
opener.addheaders = [('User-agent', 'Mozilla/5.0')]
urllib.request.install_opener(opener)




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


print("Model's state_dict:")

for param_tensor in model.state_dict(): 
    print(param_tensor, "\t", model.state_dict()[param_tensor].size())


print("Optimizer's state_dict: ")

for param_opt in optimizer.state_dict(): 
    print(param_opt, "\t", optimizer.state_dict()[param_opt])


torch.save(model, "/Users/Atiksh/OneDrive/Desktop/Coding/AI/deep-learning-v2-pytorch/my code/part 3/myModel.pth")


