/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämning2.relationsdatabas;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author buster
 */
public class Orders {
    
    private int id;
    private Costumer costumer;
    private Date date;
    private Boolean expedierad;
    private List<Shoe> shoes;
    
}
