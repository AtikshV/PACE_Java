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

    
# Define a transform to normalize the data
transform = transforms.Compose([transforms.ToTensor(),
                                transforms.Normalize((0.5,), (0.5,)),
                              ])

model = torch.load("/Users/Atiksh/OneDrive/Desktop/Coding/AI/deep-learning-v2-pytorch/my code/part 3/myModel.pth")
model.eval()


new_size = (28, 28)
imgOriginal = Image.open('/Users/Atiksh/OneDrive/Desktop/Coding/PACE_Java/output.png')
imgResized = imgOriginal.resize(new_size)
print(imgResized.size)
imgTensor = transform(imgResized)
imgTensor = imgTensor.unsqueeze_(0)
imgTensor = imgTensor.resize_(1, 784)
print(imgTensor.shape)


# Turn off gradients to speed up this part 
with torch.no_grad(): 
    logps = model(imgTensor)
    


# Output of the network are log-probabilities, need to take exponential for probabilities

ps = torch.exp(logps)

max = 0; 
maxi = 0; 
for i in range(9):  
    if(ps[0][i] > max ):
        max = ps[0][i]
        maxi = i; 

print (maxi)

helper2.view_classify(imgTensor.view(1, 28, 28), ps)

