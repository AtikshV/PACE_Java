import torch 
from torch import nn 
import torch.nn.functional as F 

class Network(nn.Module): 
    def __init__(self):
        super().__init__()
    
        self.fc1 = nn.Linear(784, 128)

        self.fc2 = nn.Linear(128, 64)

        self.fc3 = nn.Linear(64, 10)


    def forward(self, x): 
        x = F.relu(self.fc1(x))

        x = F.relu(self.fc2(x))

        x = F.softmax(self.fc3(x), dim=1)
        
        return x 


model = Network()
model

