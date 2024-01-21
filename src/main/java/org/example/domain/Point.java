package org.example.domain;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Point {
   int startRow;
   int startColumn;
   int endRow = startRow;
   int endColumn = startColumn;

   public Point(int startRow, int startColumn) {
      this.startRow = startRow;
      this.startColumn = startColumn;
   }

   public Point(int startRow, int startColumn,int endRow,int endColumn) {
      this.startRow = startRow;
      this.startColumn = startColumn;
      this.endRow = endRow;
      this.endColumn = endColumn;
   }

   public int getStartRow() {
      return startRow;
   }

   public void setStartRow(int startRow) {
      this.startRow = startRow;
   }

   public int getStartColumn() {
      return startColumn;
   }

   public void setStartColumn(int startColumn) {
      this.startColumn = startColumn;
   }

   public int getEndRow() {
      return endRow;
   }

   public void setEndRow(int endRow) {
      this.endRow = endRow;
   }

   public int getEndColumn() {
      return endColumn;
   }

   public void setEndColumn(int endColumn) {
      this.endColumn = endColumn;
   }
}
