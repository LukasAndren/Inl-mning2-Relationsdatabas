/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämning2.relationsdatabas;

import java.util.List;

/**
 *
 * @author buster
 */
public class Shoe {
    
    private int id;
    private int size;
    private int price;
    private int lagerAntal;
    private List<Brand> brands;
    private List<Category> categories;
    private List<Colour> colours;
    private List<Comment> comments;
    private List<Grade> grades;
}
