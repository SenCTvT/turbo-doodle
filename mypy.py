import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
data = pd.read_csv('data.csv')
#print(data.head())
data = data.sort_values('Vehicle_Model')
print(data)
a1 = np.array(data['Vehicle_Model'][1:])
#a2 = np.array(data['Co'][1:])
n = len(a1)
print(n)
list1 = np.unique(a1)
print(list1)
for i in range (0, len(list1)):
	newdata = data[data.Vehicle_Model == list1[i]]
	#print(newdata)
	a2 = np.array(newdata['Co'][0:])
	if(a2.size>=20):
	#print(a2)
		plt.plot(a2)
		plt.xlabel(list1[i])
		plt.ylabel('Co Level')
		
		#print(a2)
		plt.show()
	

	 

