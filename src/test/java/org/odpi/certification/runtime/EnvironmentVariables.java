package org.odpi.certification.runtime;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnvironmentVariables {
	
	
	@Test
	public void javaHome(){
		if (System.getProperty("ODPijavahome") != null) {
			String POMValue=System.getProperty("ODPijavahome");
			System.out.println("Found $JAVA_HOME and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $JAVA_HOME.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopCommonHome(){
		if (System.getProperty("ODPihadoopcommonhome") != null) {
			String POMValue=System.getProperty("ODPihadoopcommonhome");
			System.out.println("Found $HADOOP_COMMON_HOME and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_COMMON_HOME.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopCommonDir(){
		if (System.getProperty("ODPihadoopcommondir") != null) {
			String POMValue=System.getProperty("ODPihadoopcommondir");
			System.out.println("Found $HADOOP_COMMON_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_COMMON_DIR.");
			Assert.assertTrue(false);
		}
	}

	
	@Test
	public void hadoopCommonLibJarsDir(){
		if (System.getProperty("ODPihadoopcommonlibjarsdir") != null) {
			String POMValue=System.getProperty("ODPihadoopcommonlibjarsdir");
			System.out.println("Found $HADOOP_COMMON_LIB_JARS_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_COMMON_LIB_JARS_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopConfDir(){
		if (System.getProperty("ODPihadoopconfdir") != null) {
			String POMValue=System.getProperty("ODPihadoopconfdir");
			System.out.println("Found $HADOOP_CONF_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_CONF_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopHdfsHome(){
		if (System.getProperty("ODPihadoophdfshome") != null) {
			String POMValue=System.getProperty("ODPihadoophdfshome");
			System.out.println("Found $HADOOP_HDFS_HOME and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_HDFS_HOME.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hdfsDir(){
		if (System.getProperty("ODPihdfsdir") != null) {
			String POMValue=System.getProperty("ODPihdfsdir");
			System.out.println("Found $HDFS_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HDFS_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hdfsLibJarsDir(){
		if (System.getProperty("ODPihdfslibjarsdir") != null) {
			String POMValue=System.getProperty("ODPihdfslibjarsdir");
			System.out.println("Found $HDFS_LIB_JARS_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HDFS_LIB_JARS_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopYarnHome(){
		if (System.getProperty("ODPihadoopyarnhome") != null) {
			String POMValue=System.getProperty("ODPihadoopyarnhome");
			System.out.println("Found $HADOOP_YARN_HOME and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_YARN_HOME.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void yarnDir(){
		if (System.getProperty("ODPiyarndir") != null) {
			String POMValue=System.getProperty("ODPiyarndir");
			System.out.println("Found $YARN_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $YARN_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void yarnLibJarsDir(){
		if (System.getProperty("ODPiyarnlibjarsdir") != null) {
			String POMValue=System.getProperty("ODPiyarnlibjarsdir");
			System.out.println("Found $YARN_LIB_JARS_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $YARN_LIB_JARS_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopMapredHome(){
		if (System.getProperty("ODPihadoopmapredhome") != null) {
			String POMValue=System.getProperty("ODPihadoopmapredhome");
			System.out.println("Found $HADOOP_MAPRED_HOME and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_MAPRED_HOME.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void mapredDir(){
		if (System.getProperty("ODPimapreddir") != null) {
			String POMValue=System.getProperty("ODPimapreddir");
			System.out.println("Found $MAPRED_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $MAPRED_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void mapredLibJarsDir(){
		if (System.getProperty("ODPimapredlibjarsdir") != null) {
			String POMValue=System.getProperty("ODPimapredlibjarsdir");
			System.out.println("Found $MAPRED_LIB_JARS_DIR and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $MAPRED_LIB_JARS_DIR.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void hadoopToolsPath(){
		if (System.getProperty("ODPihadooptoolspath") != null) {
			String POMValue=System.getProperty("ODPihadooptoolspath");
			System.out.println("Found $HADOOP_TOOLS_PATH and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Could not find $HADOOP_TOOLS_PATH.");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void warningTest(){
		if (System.getProperty("ODPihadooptoolspath") != null) {
			String POMValue=System.getProperty("ODPihadooptoolspath");
			System.out.println("Found $HADOOP_TOOLS_PATH and is set to "+POMValue);
			Assert.assertTrue(true);
		}else{
			System.out.println("Warning test, this should be a warning.");
			Reporter.getCurrentTestResult().setAttribute("warn", "My warning message");
			
		}
	}

}
