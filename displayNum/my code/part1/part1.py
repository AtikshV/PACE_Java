# importing PyTorch 
import torch

def activation(x): 
    """ Sigmoid activation function 

        Arguments
        ---------
        x: torch.Tensor
    """
    return 1/(1+torch.exp(-x))
# Generate some data 
torch.manual_seed(7) # set the random seed so it's predictable 

# Features are 3 random normal variables
features = torch.randn((1,5))
# True weights for our data, random normal variables again 
weights = torch.randn_like(features)
# and a true bias term 
bias = torch.randn((1,1))

# passing the tensors through the activation function 
y = activation(torch.sum(features * weights) + bias)
# y = activation((features * weights).sum() + bias)

# calculating output of network with matrix multiplication 
weights = weights.view(5, 1) #resizing weights to fit ??
output = activation(torch.mm(features, weights) + bias) # using matrix multiplication 
# output = activation(torch.mm(features, weights.size(5, 1)) + bias)


print(y)
print(output)



