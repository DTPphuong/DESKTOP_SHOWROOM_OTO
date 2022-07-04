package com.source.dao.test;

import org.testng.annotations.Test;

import com.source.dao.GioHangDAO;
import com.source.dao.UsersDAO;
import com.source.model.Users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class UsersDAOTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },

    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void deleteTest() {
	  System.out.println("delete");
      String id = "";
      UsersDAO dao = new UsersDAO();
      dao.delete(id);
  }

 
  //============================
  @Before
  public void testInsert() {
      System.out.println("insert");
      Users entity = null;
      UsersDAO instance = new UsersDAO();
      instance.insert(entity);
  }

  @Test
  public void testUpdate() {
	  try {
      System.out.println("update");
      Users entity = null;
      UsersDAO instance = new UsersDAO();
      instance.update(entity);
  }catch(Exception e) {
  }
  }

  @Test
  public void testDelete() {
	  try {
      System.out.println("delete");
      String maNV = "";
      UsersDAO instance = new UsersDAO();
      instance.delete(maNV);
	  }catch(Exception e) {
	  }
    
  }

  //============================

  @Test
  public void selectAllTest() {
	  try {
	  System.out.println("select");
	  UsersDAO instance = new UsersDAO();
      List expResult = null;
      List result = instance.selectAll();
      assertEquals(result, expResult);
  }catch(Exception e) {
  }
  }

  @Test
  public void selectByIdTest() {
	  try {
	  System.out.println("selectById");
	  UsersDAO instance = new UsersDAO();
      List expResult = null;
      List result = instance.selectAll();
      assertEquals(result, expResult);
	  }catch(Exception e) {
	  }
  }

  


}
