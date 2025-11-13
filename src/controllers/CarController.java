package controllers;

import models.Car;

public class CarController {

  public void sortByName(Car[] car1){
    for (int i = 1; i < car1.length; i++) {
      Car valo1=car1[i];
      int j=i-1;
      String guardarNombre=valo1.getName();
      while (j>=0&&car1[j].getName().compareTo(guardarNombre)>0) {
        car1[j+1]=car1[j];
        j--;
      }
      car1[j+1]=valo1;
    }
  }
  
}
