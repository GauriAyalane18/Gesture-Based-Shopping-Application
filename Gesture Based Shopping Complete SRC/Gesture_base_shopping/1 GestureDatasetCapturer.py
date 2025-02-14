import numpy as np
import cv2
import os

# NEXT, PREVIOUS,ENTER,BACK,Moreinfo,Buymore,Buy,Exit,Done
typename="train"
gesturename="Done"

datasetpath="GESTURE DATASET"
if not os.path.exists(datasetpath):
    os.makedirs(datasetpath)         
    

typedataset="GESTURE DATASET//"+typename
if not os.path.exists(typedataset):
    os.makedirs(typedataset)          
        

gesturepath="GESTURE DATASET//"+typename+"//"+gesturename
if not os.path.exists(gesturepath):
    os.makedirs(gesturepath)      
    
      
cap=cv2.VideoCapture(0)
imgeno=1
x=150
y=100
h=300
w=300
while cap.isOpened():
    _,capimg=cap.read()
    img = capimg[y:y+h, x:x+w]
      
    cv2.rectangle(capimg,(x,y),(x+w,y+h),(0,0,255),3)
    cv2.imshow('Capture Image( Press q to quit)',capimg)
    k = cv2.waitKey(1)
    if k%256 == 27:
        # ESC pressed
        print("Escape hit, closing...")
        break
    elif k%256 == 32:
    # SPACE pressed
        filename=str(imgeno)   
        newfilepath=gesturepath+"//"+filename+".jpg"
        dim = (96, 96)
        img = cv2.resize(img, dim, interpolation = cv2.INTER_AREA)
            
           
        #converting from gbr to YCbCr color space
        img_YCrCb = cv2.cvtColor(img, cv2.COLOR_BGR2YCrCb)
        #skin color range for hsv color space 
        YCrCb_mask = cv2.inRange(img_YCrCb, (0, 135, 85), (255,180,135)) 
        YCrCb_mask = cv2.morphologyEx(YCrCb_mask, cv2.MORPH_OPEN, np.ones((3,3), np.uint8))
        
       
        
      
        YCrCb_result = cv2.bitwise_not(YCrCb_mask)
       
        cv2.imwrite(newfilepath,YCrCb_result)
        imgeno=imgeno+1
        print("Gesture path is ",newfilepath)
      
                
          


cap.release()
cv2.destroyAllWindows()