package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.Cell;
import com.aurionpro.model.CellAlreadyMarkedException;
import com.aurionpro.model.MarkType;

class CellTest {

 Cell test;
 @BeforeEach
 void init() {
  test=new Cell();
  System.out.println("Before Each");
 }
 
 @Test
 @Disabled
 void test() {
  fail("Not yet implemented");
 }
 
 @Test
 public void testIsEmpty() {
  boolean str=test.isEmpty();
  assertTrue(str);
 }

// @Test
// public void testGetMark() {
//  MarkType mark=test.getMark();
//  assertTrue(mark==MarkType.O||mark==MarkType.X);
// }
 
 @Test
 public void testSetMark() {
  try {
   test.setMark(MarkType.X);
  } catch (CellAlreadyMarkedException e) {
   e.printStackTrace();
  }
  assertEquals(MarkType.O, test.getMark());
 }
 
 @Test
 public void testSetMark_cellAlreadyMarkedException() {
  try {
   System.out.println("Hello");
   test.setMark(MarkType.X);
  } catch (CellAlreadyMarkedException e) {
   e.printStackTrace();
  }
//  assertEquals(MarkType.X, test.getMark());
  assertThrows(CellAlreadyMarkedException.class, ()->test.setMark(MarkType.O));
 }

}
