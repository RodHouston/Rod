

public class Stack {
    Node first; 
    
  
    public Stack(){
       first = null; //initialize the empty stack
    }
   
    public void push(Node newNode){
       
        if (first == null){//if the stack is empty, make first point to new Node.
            first = newNode;
            return;
        }
       
        Node temp = first;
        
        while (temp.next!= null){     //if the stack is not empty, loop until we get to the end of the list,
            temp = temp.next; 
        }
         //then make the last Node point to new Node
        temp.next = newNode;
    }

      
            
    
 
    public Node pop() {         
        if (first == null){//if the stack is empty, return null
            return null;   
        }
        
         if( first.next == null){   //Handle the case where there is only one Node in the stack   
                   
            System.out.println("only one node");
                }
         else if(first.next != null)   
                    //Handle the case where there are at Least two elements in the stack
return first = first.next;
        return null;
    }

    
    
  
      
    
    public void print() {
        
		//display the entire stack
        Node tempDisplay = first; // start at the beginning of linkedList
            
        while (tempDisplay != null){ // Executes until we don't find end of list.
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.next; // move to next Node
         
        }
           
        System.out.println();
    }
}
