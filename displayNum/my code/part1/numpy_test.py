import numpy as np 
import torch 

np.set_printoptions(precision=8)
a = np.random.rand(4, 3)
torch.set_printoptions(precision=8)
b = torch.from_numpy(a)

print(b)