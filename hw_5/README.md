# PRAKTIKUM 


1. AVL puu on binaarpuu, binaarpuu kuju sõltub elementide lisamise järjestusest


# AVL PUUD MATERJALID

+ [Param ja vasakpöörded ning miks neid vaja võiks minna](https://www.youtube.com/watch?v=M0Y3kDuyUCU) 
   + Parem pööre - GRANDPARENT LIIGUP PAREMALE 
   + Vasak pööre - GRANDPARENT LIIGUB VASAKULE
+ [Kõik Pöörded üldiselt ja millal neid vaja võiks minna](https://www.youtube.com/watch?v=NczBLeco6XA)
   + Parem,Vasak, ParemVasak,VasakParem   
+ [Pöörete koodimine](https://www.youtube.com/watch?v=Y-nmgO8ALjM)
![image](https://user-images.githubusercontent.com/21141607/139584178-cd479ec2-d1ce-4c33-9e9f-8915f718d410.png)
+ [AVL puude sissejuhatus](https://www.youtube.com/watch?v=-9sHvAnLN_w)
+ [AVL puude täielik näide](https://www.youtube.com/watch?v=7m94k2Qhg68)
   + Puu ei tohi kunagi rohkem kui 1 võrra tasakaalust väljas olla
   + Kui lisame elemente, siis teeme vastavalt pöördeid, kui puu on tasakaalust väljas
   + Puu on tasakaalust väljas, kui leidub vanem, kelle parema/vasaku poole laster kõrgus on rohkem kui 1 võrra suurem/väiksem kui vasaku/parena kaste kõrgus

## INBALANCE 

+ Parem pööre - GRANDPARENT LIIGUP PAREMALE 
+ Vasak pööre - GRANDPARENT LIIGUB VASAKULE

+ left child left subrtree has inbalance -> right rotation
+ right child right subtree has inbalance -> left rotation
+ right child left subtree has inbalance -> right rotation around child and then left rotation around grandparent 
+ left child right subtree has inbalance -> left rotation around child ant then right rotation  around grandparent 

# ROTATION CODES 

We do the rotations on GrandParent level as here we actually see the inbalance happening. 
NB - in AVL trees the max difference can always be max 2. 

~~~python
class Node
...
def rightRotate(self):# At grandparent node where inbalance is happening
   oldTrunkNode=Node(self.info, temp,self.right) # With righ trun we are moving grandparent to right lower leve
   temp=self.left.right # As we are replacing the newTrun right with grandParent we need 
   newTrunkNode=Node(self.left.info, self.left.left,oldTrunkNode)# Make old Trunk node to be int right
   oldTrunkNode.left=temp # Setting this to be the previous left right node as itse bigger than previous left but smaller than trunk    

def leftRotate(self): 
  
~~~


## AVL PUU KOODIVÕTTED 

+ [Elementide lisamine AVL puu](https://www.geeksforgeeks.org/avl-tree-set-1-insertion/)
+ [Elementide eemaldamine  binaarpuu](https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/?ref=lbp)
+ [AVL puu elementide eemaldamine](https://www.geeksforgeeks.org/avl-tree-set-2-deletion/?ref=lbp)
