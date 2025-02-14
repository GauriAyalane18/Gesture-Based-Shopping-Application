/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gesturebasedshopping;

import java.util.Random;

/**
 *
 * @author 4250
 */
public class RandomNumGenerator
{
    public String getRandomNumber(int low,int high)
    {
        Random r=new Random();
        int result=r.nextInt(high-low)+low;
        String res=Integer.toString(result);
        return res;
    }
}
