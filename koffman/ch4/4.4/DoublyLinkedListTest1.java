public class DoublyLinkedListTest1 {
	public static void main(String[] sa) throws Exception {
		new DoublyLinkedListTest1().doIt();
	}
	private void doIt() throws Exception {
		DoublyLinkedList<String> dlls = Utility.getDoublyLinkedList();
		System.out.println("0. "+dlls);
		 dlls.addFirst("A");
		 System.out.println("addFirst result: "+dlls);
		 dlls.addLast("B");
		 System.out.println("addLast result: "+dlls);
		 dlls.addNext("C");
		 System.out.println("addNext result: "+dlls);
		 
		 System.out.println("getPrevious result: "+dlls.getPrevious());
		 System.out.println("getPrevious after: "+dlls);
		 dlls.addPrevious("--");
		 System.out.println("addPrevious result: "+dlls);
		 
		 System.out.println("getFirst result: "+dlls.getFirst());

		 dlls.addNext("B");

		 dlls.addPrevious("--");
		 System.out.println("addPrevious result: "+dlls);

		// System.out.println("3. "+dlls);
		// dlls.addLast("D");
		// System.out.println("4. "+dlls);
		// //dlls.getFirst();
		// System.out.println("5. getFirst(): "+dlls.getFirst());
		// //dlls.getNext();
		// System.out.println("6. getNext(): "+dlls.getNext());
		// dlls.removePrevious();
		// System.out.println("7. "+dlls);
		// System.out.println("8. "+dlls);
		// dlls.addFirst("A");
		// System.out.println("9. "+dlls);
		// dlls.removeFirst();
		// System.out.println("10. "+dlls);
		// dlls.addFirst("B");
		// System.out.println("11. "+dlls);
		// dlls.addFirst("C");
		// System.out.println("12. "+dlls);
		// dlls.addFirst("D");
		// System.out.println("13. "+dlls);
		// dlls.addLast("E");
		// System.out.println("14. "+dlls);
		// dlls.addLast("F");
		// System.out.println("15. "+dlls);
		// dlls.addFirst("G");
		// System.out.println("16. "+dlls);
		// //dlls.getFirst();
		// System.out.println("17. "+dlls.getFirst());
		// //dlls.getNext();
		// System.out.println("18. "+dlls.getNext());
		// //dlls.getNext();
		// System.out.println("19. "+dlls.getNext());
		// System.out.println("19b. "+dlls);
		// //dlls.getPrevious();
		// //System.out.println("20. "+dlls.getPrevious());
		// dlls.addNext("H");
		// System.out.println("21. "+dlls);
		// dlls.addNext("I");
		// System.out.println("22. "+dlls);
		// dlls.addPrevious("J");
		// dlls.addPrevious("K");
		// System.out.println("23. "+dlls);
		// dlls.removeFirst();
		// System.out.println("24. "+dlls);
		// dlls.removeFirst();
		// System.out.println("25. "+dlls);
		// dlls.removeFirst();
		// System.out.println("26. "+dlls);
		// dlls.removeLast();
		// System.out.println("27. "+dlls);
		// dlls.removeLast();
		// System.out.println("28. "+dlls);

		// dlls.addLast("Q");
		// dlls.getFirst();
		// dlls.getNext();
		// dlls.removeNext();
		// System.out.println("29. "+dlls);
		// dlls.removePrevious();
		// System.out.println("30. "+dlls);
		// dlls.removeFirst();
		// System.out.println("31. "+dlls);
		// dlls.removeFirst();
		// System.out.println("32. "+dlls);
		// dlls.removeFirst();
		// System.out.println("33. "+dlls);
	}
}
