package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    public void DepthFunctionTest1() {
        BinaryTree arbol = new BinaryTree("1");
        arbol.insert("2", arbol.getRoot(), true);

        int depth = arbol.depth();
        Assertions.assertEquals(2, depth);

    }

    /* Comentando el DepthFunctionTest1()
    * Creo un arbol con su nodo raiz y un nodo en el siguiente nivel
    * Comprobamos que la profunfidad debería ser 2, sin embargo no lo es, no pasa el test
    *
    * DepthFuntionTestX, siendo X cualquier numero, probando funcionalidad parecida
    * */

    @Test
    public void DepthFuntionTest2(){
        BinaryTree arbol = new BinaryTree("1");
        arbol.insert("2", arbol.getRoot(), true);
        // arbol.insert("3", )
    }


}