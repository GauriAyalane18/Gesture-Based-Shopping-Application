# Gesture-Based Shopping Application

## Overview
The **Gesture-Based Shopping Application** is an innovative project that integrates **Java, Python, and Deep Learning** to enable users to navigate and interact with an e-commerce platform using hand gestures. This project leverages **computer vision** and **machine learning** techniques to recognize user gestures and map them to various shopping actions such as navigating, selecting, and purchasing products.

## Features
- **Gesture Recognition:** Uses deep learning models to detect and classify hand gestures.
- **Seamless Integration:** Built using **Java** for UI, **Python** for deep learning, and **CNN models** for gesture recognition.
- **Shopping Actions:** Users can perform actions such as:
  - Navigate back and forward
  - Select products
  - Add items to cart
  - Proceed to checkout
- **Machine Learning:** Convolutional Neural Networks (CNN) trained on a custom gesture dataset.
- **User-Friendly Interface:** Developed using Java Swing with Nimbus Look and Feel.

## Project Structure
```
Gesture-Based-Shopping-Application/
│── Gesture_base_shopping/
│   │── GESTURE DATASET/
│   │   ├── train/
│   │   ├── test/
│   │── images/
│   │── model/
│   │── gesturebasedshopping/
│── 1 GestureDatasetCapturer.py
│── 2 CNN Training.py
│── 3 GestureEngine.py
│── Final DB
│── Libraries.txt
```

## Technologies Used
- **Programming Languages:** Java, Python
- **Frameworks & Libraries:**
  - Java Swing for UI development
  - OpenCV & TensorFlow for gesture recognition
  - Deep learning with Convolutional Neural Networks (CNN)
- **Dataset:** Custom dataset of hand gestures categorized into different actions

## Installation & Setup
### Prerequisites
- **Java Development Kit (JDK)** installed
- **Python 3.x** installed with required libraries
- **TensorFlow, OpenCV, NumPy** installed

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/GauriAyalane18/Gesture-Based-Shopping-Application.git
   ```
2. Install required Python dependencies:
   ```sh
   pip install -r Libraries.txt
   ```
3. Train the CNN model:
   ```sh
   python "2 CNN Training.py"
   ```
4. Run the Gesture Engine:
   ```sh
   python "3 GestureEngine.py"
   ```
5. Start the Java application:
   ```sh
   javac com/mycompany/gesturebasedshopping/Main.java
   java com.mycompany.gesturebasedshopping.Main
   ```

## Usage
- The application opens in fullscreen mode.
- Use predefined gestures to navigate and shop.
- The backend model will recognize gestures and map them to shopping actions.

## Contributors
- **Gauri Ayalane** (Developer)


