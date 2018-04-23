/*
** *****************kiranmaharjan8888@gmail.com
*Concept of:----
*override
* Abstraction:

* Concept of override:

*Constructor:

*Inheritence:
 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.entities.BaseGuitar;
import com.kingkong.dataabstraction.entities.ElectricGuitar;
import com.kingkong.dataabstraction.entities.Guitar;

/**
 *
 * @author kiran
 */
public class Program {

    
    public static void main(String[] args) {
        
        //..guitar -> parent class, other guitar -> child
       
  /* --uncomment 1
        ElectricGuitar g= new ElectricGuitar();
        g.play();//calls parent play()  */
  
/*-- solution 1: override parent play()
               
        solution2:  make fuction like plays1 or plays2. for new objects like electricguitar .. 
             g.play_ElectricGuitar();
    solution 3: so make abstract play() in parent 

        */      
  
           //Guitar g=new Guitar() {}; //-> cannot be created. it asks which guiatar?
          Guitar g=new ElectricGuitar();
           g.play();
                  
  
  
    }
    
}
