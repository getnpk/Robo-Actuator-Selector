/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.motords;

/**
 *
 * @author nitinpkumar
 */
public class RootNode {

    private Node current;
    
    
    public RootNode(Node node){
        this.current = node;
    }
    
    public boolean hasNoNode(){
        return this.current.getNo() != null;
    }
    
    public boolean hasYesNode(){
        return this.current.getYes() != null;
    }
    
    public boolean isRootNode(){
        return this.current.getBack() == null;
    }
    
    public Node getNode(){
        return this.current;
    }

    @Override
    public String toString() {
        return "RootNode{" + "current=" + current + '}';
    }
    
    
}
