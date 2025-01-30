package com.stream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Device {
	private String deviceName;
	private String ipAddress;
	private String userName;
	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Device(String deviceName, String ipAddress, String userName) {
		super();
		this.deviceName = deviceName;
		this.ipAddress = ipAddress;
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", ipAddress=" + ipAddress + ", userName=" + userName + "]";
	}

	public static void main(String[] args) {
		List<Device> c=Arrays.asList(new Device("Router","11","Admin"),
				new Device("Router","11","fish"),
				new Device("Router","12","Batman"),
				new Device("Switch","13","Jacky"),
				new Device("Cables","14","Admin"),
				new Device("BTS","15","Spider"),
				new Device("Router","16","abc"));
		
		Stream<Device> cs= c.stream();
		Predicate<Device> filterByDevice= (e)-> e.getDeviceName()=="Router";
		Function<Device, String> display= (e)->
		e.getDeviceName().toUpperCase()+","+ e.getIpAddress().toUpperCase()+","+e.getUserName().toUpperCase();
		
		cs.filter(filterByDevice).map(display).
		forEach((e)-> System.out.println(e));
		
		
		
		System.out.println("----------------------------------------------------------");
		Stream<Device> css= c.stream();
		Predicate<Device> filterByUser= (f)-> f.getUserName()=="Admin";
		Function<Device, String> displays= (f)->
		f.getDeviceName().toUpperCase()+","+ f.getIpAddress().toUpperCase()+","+f.getUserName().toUpperCase();
		
		css.filter(filterByUser).map(displays).
		forEach((f)-> System.out.println(f));	

	}

}
