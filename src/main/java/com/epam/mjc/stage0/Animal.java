package com.epam.mjc.stage0;

public class Animal {
      private String color;
      private int numberOfPaws;
      private boolean hasFur;

      public Animal (String color, int numberOfPaws, boolean hasFur) {
          this.color = color;
          this.numberOfPaws = numberOfPaws;
          this.hasFur = hasFur;
      }
      public String numOfPaws () {
          if (numberOfPaws > 1) {
              return "paws";
          } else {
              return "paw";
          }
      }
      public String isTrueOrFalse () {
          if (hasFur == true) {
              return "a";
          } else {
              return "no";
          }
      }
      public Object getDescription() {
          return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + numOfPaws() + " and " + isTrueOrFalse() + " fur.";

}
}
