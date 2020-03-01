/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author ABIDSTIC
 */
public class ObjectPass {
    int a=6, b=4;

    public ObjectPass(int i, int j) {
        a = i;
        b = j;
    }
    
    public ObjectPass() {
        
    }
    
    public ObjectPass(ObjectPass op){
        a = op.a;
        b = op.b;
    }
    
    boolean check(ObjectPass op){
        return (op.a==this.a && op.b == this.b);
    }
    
    ObjectPass adding(ObjectPass ob1, ObjectPass ob2){
        ObjectPass temp = new ObjectPass();
        temp.a = ob1.a + ob2.a;
        temp.b = ob1.b + ob2.b;
        return temp;
    }
}
