package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.BindException;

public class Tests {


    @Test
    public void DepthFunctionTest1() {
        // Probando depth() --> Method to get the depth of the tree.

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
        // Probando depth() --> Method to get the depth of the tree.
        BinaryTree arbol = new BinaryTree("1");
        Node node_2 = arbol.insert("2", arbol.getRoot(), true);
        Node node_3 = arbol.insert("3", node_2, true);

        // La profundidad deberia ser 3

        Assertions.assertEquals(3, arbol.depth());
    }

    @Test
    public void depthFunctionTest3(){
        // Probando depth(Node<T> node) - -> Method to get the depth of a subtree beggining at node.

        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        Node node_4 = arbol.insert("4", node_1, false);

        Node node_5 = arbol.insert("5", node_2, true);
        Node node_6 = arbol.insert("6", node_2, false);

        Node node_7 = arbol.insert("7", node_3, true);
        Node node_8 = arbol.insert("8", node_3, false);

        System.out.println(arbol.toString());

        Assertions.assertEquals(3, arbol.depth(node_1));
        // Vemos en la prueba que sale la profundidad dos menos de la que deberia ser.
        // Desde el nodo 1, la profundidad es 3, sin embargo da 1.
    }

    @Test
    public void equalsFuntionTest1(){
        // Probando equals(BinaryTree<T> tree) --> Method to compare this tree to another.
        // Vamos a probar con arboles iguales
        BinaryTree arbol1 = crearArbol00();
        BinaryTree arbol2 = crearArbol01();

        System.out.println(arbol1.toString());

        System.out.println(arbol2.toString());
        System.out.println(arbol1.equals(arbol2));

        Assertions.assertEquals(true, arbol1.equals(arbol2));
    }

    public BinaryTree crearArbol00(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        return arbol;
    }

    public BinaryTree crearArbol01(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        return arbol;
    }
    @Test
    public void equalsFuntionTest2(){
        // Probando equals(BinaryTree<T> tree) --> Method to compare this tree to another.
        // Vamos a probar con arboles distintos en forma
        BinaryTree arbol1 = crearArbol1();
        BinaryTree arbol2 = crearArbol2();

        System.out.println(arbol1.toString());
        System.out.println(arbol2.toString());

        Assertions.assertEquals(false, arbol1.equals(arbol2));
    }
    public BinaryTree crearArbol1(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        return arbol;
    }

    public BinaryTree crearArbol2(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        Node node_4 = arbol.insert("4", node_1, false);
        return arbol;
    }

   @Test
    public void equalsFuntionTest3(){
        // Probando equals(BinaryTree<T> tree) --> Method to compare this tree to another.
        // Vamos a probar con arboles distintos solo en contenido
        BinaryTree arbol3 = crearArbol3();
        BinaryTree arbol4 = crearArbol4();

       System.out.println(arbol3.toString());
       System.out.println(arbol4.toString());

        Assertions.assertEquals(false ,arbol3.equals(arbol4));

    }

    public BinaryTree crearArbol3(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        return arbol;
    }

    public BinaryTree crearArbol4(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("4", node_1, true);
        return arbol;
    }

    @Test
    public void equalsFuntionTest4(){
        // Probando equals(BinaryTree<T> tree) --> Method to compare this tree to another.
        // Vamos a probar con arboles distintos en forma y en contenido
        BinaryTree arbol5 = crearArbol5();
        BinaryTree arbol6 = crearArbol6();

        Assertions.assertEquals(false, arbol6.equals(arbol5));
    }
    public BinaryTree crearArbol5(){
        BinaryTree arbol = new BinaryTree("47");
        Node node_1 = arbol.insert("3414", arbol.getRoot(), true);
        Node node_2 = arbol.insert("4567543", arbol.getRoot(), false);

        Node node_3 = arbol.insert("76", node_1, true);
        Node node_4 = arbol.insert("312", node_1, false);

        Node node_5 = arbol.insert("768", node_4, false);

        return arbol;
    }

    public BinaryTree crearArbol6(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("4", node_1, true);
        return arbol;
    }
    @Test
    public void equalsFuntionTest5(){
        // Probando equals(BinaryTree<T> tree) --> Method to compare this tree to another.

        BinaryTree arbol7 = crearArbol7();
        BinaryTree arbol8 = crearArbol8();

        Assertions.assertEquals(false, arbol7.equals(arbol8));
    }

    public BinaryTree crearArbol7(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        return arbol;
    }

    public BinaryTree crearArbol8(){
        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);


        return arbol;
    }





}
