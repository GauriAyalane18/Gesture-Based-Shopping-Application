
package com.mycompany.gesturebasedshopping;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ContollerThread extends Thread
{
    MainFrame obj;
    TelevisionFrame obj1;
    MobileFrame obj2;
    CameraFrame obj3;
    WashingMachineFrame obj4;
    TelevisionDetailInfoFrame obj5;
    MobileDetailInfoFrame obj6;
    CameraDetailInfoFrame obj7;
    WmachineDetailInfoFrame obj8;
    CartFrame obj9;
    LastFrame obj10;
     public void setMainFrameObject(MainFrame ob)
    {
        obj=ob;
    }
      public void setTelevisionFrameObject(TelevisionFrame ob)
    {
        obj1=ob;
    }
      public void setMobileFrameObject(MobileFrame ob)
    {
        obj2=ob;
    }
      public void setCameraFrameObject(CameraFrame ob)
    {
        obj3=ob;
    }
       public void setWashingMachineFrameObject(WashingMachineFrame ob)
    {
        obj4=ob;
    }
       public void setTelevisionDetailInfoFrameObject(TelevisionDetailInfoFrame ob)
    {
        obj5=ob;
    }
       public void setMobileDetailInfoFrameObject(MobileDetailInfoFrame ob)
    {
        obj6=ob;
    }
       public void setCameraDetailInfoFrameObject(CameraDetailInfoFrame ob)
    {
        obj7=ob;
    }
       public void setWmachineDetailInfoFrameObject(WmachineDetailInfoFrame ob)
    {
        obj8=ob;
    }
        public void setCartFrameObject(CartFrame ob)
    {
        obj9=ob;
    }
        public void setLastFrameObject(LastFrame ob)
    {
        obj10=ob;
    }
    public void run()
    {
        try {
            
           Robot robot = null;
           robot = new Robot();
            
        while(true)
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestureapp", "root", "root");
            Statement st = conn.createStatement();

           String query="Select *from gestureinfo where gid=1";
             ResultSet rs1=st.executeQuery(query);
             String gesturename="";
                if(rs1.next())
                {
                     gesturename = rs1.getString(2);
                 }
               System.out.println("gesturename 1 : " + gesturename);
                String ges = "BLANK", gid1 = "1";
                 String upquery = "Update gestureinfo set  gesturename='" + ges + "'where gid='" + gid1 + "'";
                 st.executeUpdate(upquery);
                 st.close();
                 conn.close();
                 
                       
                
          
           if(!gesturename.equals("BLANK"))
           {
              System.out.println("gesturename 2: " + gesturename);
               
           if(GestureInfo.frameno==1)
           {
               if(gesturename.equals("next"))
               {
                   obj.toggle();
                   System.out.println("In Frame 1");
                 
                                    
               }
               if(gesturename.equals("buy"))
               {
                  obj.press(); 
               }    
            }
           else if(GestureInfo.frameno==2)
           {
            
               if(gesturename.equals("next"))
               {
                   obj1.funNext();
                   System.out.println("In Frame 2");
                 
                                    
               }
               if(gesturename.equals("previous"))
               {
                 obj1.funPrevious();
               }
               if(gesturename.equals("more"))
               {
                   obj1.productDetails();
               }
               if(gesturename.equals("back"))
               {
                   obj1.mainFrame();
               }
           }
             else if(GestureInfo.frameno==3)
           {
            
               if(gesturename.equals("next"))
               {
                   obj2.funNext();
                   System.out.println("In Frame 3");
                 
                                    
               }
               if(gesturename.equals("previous"))
               {
                 obj2.funPrevious();
               }
               if(gesturename.equals("more"))
               {
                   obj2.productDetails();
               }
               if(gesturename.equals("back"))
               {
                   obj2.mainFrame();
               }
           }
             else if(GestureInfo.frameno==4)
           {
            
               if(gesturename.equals("next"))
               {
                   obj3.funNext();
                   System.out.println("In Frame 4");
                 
                                    
               }
               if(gesturename.equals("previous"))
               {
                 obj3.funPrevious();
               }
               if(gesturename.equals("more"))
               {
                   obj3.productDetails();
               }
               if(gesturename.equals("back"))
               {
                   obj3.mainFrame();
               }
           }
             else if(GestureInfo.frameno==5)
           {
            
               if(gesturename.equals("next"))
               {
                   obj4.funNext();
                   System.out.println("In Frame 5");
                 
                                    
               }
               if(gesturename.equals("previous"))
               {
                 obj4.funPrevious();
               }
               if(gesturename.equals("more"))
               {
                   obj4.productDetails();
               }
               if(gesturename.equals("back"))
               {
                   obj4.mainFrame();
               }
           }
           else if(GestureInfo.frameno==6)
           {
            
               if(gesturename.equals("buy"))
               {
                   obj5.tokenGeneration();
                   System.out.println("In Frame 6");
                 
                                    
               }
               if(gesturename.equals("back"))
               {
                 obj5.funBack();
               }
              
           }
            else if(GestureInfo.frameno==7)
           {
            
               if(gesturename.equals("buy"))
               {
                   obj6.tokenGeneration();
                   System.out.println("In Frame 7");
                 
                                    
               }
               if(gesturename.equals("back"))
               {
                 obj6.funBack();
               }
              
           }
            else if(GestureInfo.frameno==8)
           {
            
               if(gesturename.equals("buy"))
               {
                   obj7.tokenGeneration();
                   System.out.println("In Frame 8");
                 
                                    
               }
               if(gesturename.equals("back"))
               {
                 obj7.funBack();
               }
              
           }
            else if(GestureInfo.frameno==9)
           {
            
               if(gesturename.equals("buy"))
               {
                   obj8.tokenGeneration();
                   System.out.println("In Frame 9");
                 
                                    
               }
               if(gesturename.equals("back"))
               {
                 obj8.funBack();
               }
              
           }
            else if(GestureInfo.frameno==10)
            {
                if(gesturename.equals("next"))
                {
                    obj9.mainFrame();
                }
                if(gesturename.equals("back"))
                {
                    obj9.lastFrame();
                }
            }
            else if(GestureInfo.frameno==11)
            {
                if(gesturename.equals("buy"))
                {
                    obj10.mainFrame();
                }
            }
          
               
           }     
             Thread.sleep(5000);
        }
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ContollerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
//   // catch(Exception ex)
//    {
//        System.out.println("Exception is "+ex);
//    }
//   // catch(Exception ex)
//    {
//        System.out.println("Exception is "+ex);
//    }
}
}
