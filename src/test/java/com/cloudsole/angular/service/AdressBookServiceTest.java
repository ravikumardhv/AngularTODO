package com.cloudsole.angular.service;

import org.junit.Assert;
import org.junit.Test;

import com.cloudsole.angular.model.AddressBook;

public class AdressBookServiceTest {
	
	AddressBookServiceImpl impl=new AddressBookServiceImpl();
	
	@Test
	public void testCreateAddressBookWithNoRecords(){
		 AddressBook addressBook1 = new AddressBook();
	        addressBook1.setEmail("test@mail.com");
	        addressBook1.setFirstName("John");
	        addressBook1.setLastName("Doe");
	        addressBook1.setPhone("12345678");
		impl.createAddressBook(addressBook1);
		
		Assert.assertNotNull(impl.addressBooks);
		Assert.assertTrue(impl.addressBooks.size()==1);
		
	}

}
