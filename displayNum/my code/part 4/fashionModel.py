import torch
from torchvision import transforms, datasets
from torch import nn; 
import helper2
import torch.nn.functional as F
from torch import optim


# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,), (0.5,))])

# Download and load the training data
trainset = datasets.FashionMNIST('~/.pytorch/F_MNIST_data/', download=True, train=True, transform=transform)
trainloader = torch.utils.data.DataLoader(trainset, batch_size=64, shuffle=True)

# Download and load the test data
testset = datasets.FashionMNIST('~/.pytorch/F_MNIST_data/', download=True, train=False, transform=transform)
testloader = torch.utils.data.DataLoader(testset, batch_size=64, shuffle=True)


model = nn.Sequential(nn.Linear(784, 128),
                      nn.ReLU(),
                      nn.Linear(128, 64),
                      nn.ReLU(),
                      nn.Linear(64, 10), 
                      nn.LogSoftmax(dim=1))


criterion = nn.NLLLoss()

optimizer = optim.SGD(model.parameters(), lr=0.01) #change to 0.03 maybe 

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

torch.save(model, "/Users/Atiksh/OneDrive/Desktop/Coding/AI/deep-learning-v2-pytorch/my code/part 4/myModel.pth")




