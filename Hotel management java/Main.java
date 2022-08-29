import java.lang.*;
import classes.*;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
public class Main
{
	public static void main(String args[]){



 	    System.out.println(" ======================================================================================================================================================");
 		System.out.println(" ======================================================================================================================================================" );
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||-------------                                                                                                      -----------------|||||||||");
 		System.out.println(" |||||||||----------------                                                                                                --------------------|||||||||");
 		System.out.println(" |||||||||---------------- 000       000       00  0000000  00       000000   0000000  000      000   0000000                     ------------------|||");
 		System.out.println(" |||||||||----------------- 000     00 00     00   00       00       00       00   00  00 00  00 00   00                        --------------------|||");
 		System.out.println(" |||||||||------------------ 000   00   00   00    000000   00       00       00   00  00   00   00   000000                      ------------------|||");
 		System.out.println(" |||||||||------------------- 000 00     00 00     00       00       00       00   00  00        00   00                        --------------------|||");
 		System.out.println(" |||||||||-------------------- 0000       000      0000000  0000000  000000   0000000  00        00   0000000                    ------------------ |||");
 		System.out.println(" |||||||||---------------------                                                                                           --------------------|||||||||");
 		System.out.println(" |||||||||------------------------                              00000000   000000                                      -----------------------|||||||||");
 		System.out.println(" |||||||||--------------------------                               00      00  00                                    -------------------------|||||||||");
 		System.out.println(" |||||||||------------------------                                 00      00  00                                        ---------------------|||||||||");
 		System.out.println(" |||||||||---------------------                                    00      00  00                                           ------------------|||||||||");
 		System.out.println(" |||||||||-----------------                                        00      000000                                              ---------------|||||||||");
 		System.out.println(" |||||||||---------------                                                                                                        -------------|||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   |||||||||");
 		System.out.println(" |||||||||  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   * |||||||||");
 		System.out.println(" |||||||||*   *   *   *   *   *   *   *   *     000        0000000000   000     00    0000000  *   *   *   *   *   *   *   *   *    *  *   *  |||||||||");
 		System.out.println(" |||||||||  *   *   *   *   *   *   *    *   * 00 00       00      00   0000    00        00  *   *   *   *   *    *   *   *    *   *   *  *  |||||||||");
 		System.out.println(" |||||||||*   *   *   *    *   *   *    *   * 00   00      00      00   00 00   00       00    *  *    *   *    *   *   *    *    *   *  *  * |||||||||");
 		System.out.println(" |||||||||  *   *   *    *    *   *    *   * 00     00     0000000000   00  00  00      00   *   *   *    *   *   *   *    *    *   *   *  *  |||||||||");
 		System.out.println(" |||||||||*   *   *    *    *   *    *    * 00 00000 00    00           00   00 00     00      *   *   *    *   *   *   *    *    *   *   *  *|||||||||");
 		System.out.println(" |||||||||  *   *   *    *    *    *   *   00         00   00           00    0000    00     *   *   *    *   *   *   *    *    *   *   *   * |||||||||");
 		System.out.println(" |||||||||*   *   *   *    *    *    *    00           00  00           00     000   0000000 *   *   *   *   *    *   *   *   *    *   *  *  *|||||||||");
 		System.out.println(" |||||||||  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   |||||||||");
 		System.out.println(" |||||||||*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *  *   *   *   *   *   *   *   *   *   *   *   *   *   *  * |||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" |||||||||====================================================================================================================================|||||||||");
 		System.out.println(" ======================================================================================================================================================");
		Scanner input =new Scanner(System.in);
				Hotel hut = new Hotel();

				File folder = new File("Data");
				folder.mkdir();
				String path = folder.getAbsolutePath();
				File file= new File(path+"/Fileio.txt");

				File file1 = new File(path+"/File.txt");
				File file4 = new File(path+"/File4.txt");
				File file5 = new File(path+"/Manager.txt");
				File file6 = new File(path+"/Staff.txt");
				File file7 = new File(path+"/Maid.txt");
				File file8 = new File(path+"/Room.txt"); //Foreigner
 				File file9 = new File(path+"/Foreigner Guest Data.txt");
				File file10= new File(path+"/Local Guest Data.txt");
				try{
        file.createNewFile();
				String file_path = file.getAbsolutePath();

				file1.createNewFile();
				String file1_path = file1.getAbsolutePath();

				file4.createNewFile();
				String file4_path = file4.getAbsolutePath();

				file5.createNewFile();
				String file5_path = file5.getAbsolutePath();

				file6.createNewFile();
				String file6_path = file6.getAbsolutePath();

				file7.createNewFile();
				String file7_path = file7.getAbsolutePath();

				file8.createNewFile();
				String file8_path = file8.getAbsolutePath();

				file9.createNewFile();
				String file9_path = file9.getAbsolutePath();

				file10.createNewFile();
				String file10_path = file10.getAbsolutePath();


		//	}catch(Exception f1){
			//	System.out.println(f1);
//}

				System.out.println();
 	int choice=0;
 	boolean repeat=true;
 	while(repeat){
 		System.out.println("*******************       WHO ARE YOU?       *******************************");
 		System.out.println("                          1.ADMIN                                           ");
 		System.out.println("                          2.GUEST                                           ");
 		System.out.println("                          3.EXIT                                            ");
 		System.out.print("Enter your choice :   ");
 		try{
 		choice = input.nextInt();
 	}
 	catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
//##############################################################################################################################################################
		Formatter choice1 = new Formatter(file_path);
		choice1.format("Data entry for Identy "+choice+"\n");
		choice1.close();

 		input.nextLine();

 		if(choice==1)
 		{
		String name="admin",pass="password";
		System.out.print("Enter username: ");
		String name1=input.nextLine();
		System.out.print("Enter Password: ");
		String pass1=input.nextLine();

        if(name.equals(name1) && pass.equals(pass1))
        {
            System.out.println("------------------------Welcome "+name1+" you have Logged-in Successfully-------------------------------");








//##############################################################################################################################################################
			Formatter name_store = new Formatter(file1_path);
			name_store.format("Data entry "+name+"\n");
			name_store.close();

 			System.out.println("WELCOME SIR <3");
 			boolean repeat1 = true;
 			int button=0;
 			while(repeat1){

 				System.out.println("***************          What do you want to do?        ******************");
 				System.out.println("						1.Employee Management                             ");
 				System.out.println("						2.Room Management                                 ");
 				System.out.println("						3.Search An Employee                              ");
 				System.out.println("						4.Show All Employee                               ");
 				System.out.println("						5.Go Back                                         ");
 				System.out.print("Enter your choice : ");
 				try{
         		button=input.nextInt();
         	}
         	catch(Exception z){
 			System.out.println("******Please enter Integer Number!!!**********");
 			}
 			input.nextLine();
 			System.out.println();

         		switch(button){

         			case 1:
         				System.out.println("-----------You Have Selected Employee Management--------------");
         				System.out.println();

         				int button69=0;
         				boolean repeat69=true;
         				while(repeat69){
         					System.out.println("     1.Manager Management");
         					System.out.println("     2.Staff Management  ");
         					System.out.println("     3.Maid Management   ");
         					System.out.println("     4.Go Back   ");

         					System.out.print("Enter your choise : ");
         					try{
         					button69 = input.nextInt();
         				}
         				catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	input.nextLine();
 	System.out.println();
//##############################################################################################################################################################
								     	Formatter button691 = new Formatter(file4_path);
											button691.format("Data entry for Identy "+button69+"\n");
											button691.close();

         					switch (button69){
         				case 1 :
         					System.out.println("----------You Have Selected Manager Management--------------");
    	   					int button3=0;
    	   					boolean repeat2 = true;
         					while(repeat2){
         					System.out.println("       1.Add New Manager    ");
         					System.out.println("       2.Remove Manager     ");
         					System.out.println("       3.Go back            ");

         					System.out.print("Enter your choice : ");
         					try{
         					button3 = input.nextInt();
         				}
         					catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	input.nextLine();
 	System.out.println();
         					switch(button3){
         						case 1:
         							System.out.println("------------You Have selected Add New Manager---------------");
         							System.out.println();

									input.nextLine();
									System.out.print("Enter Manager ID  : ");
									String EmpID1 = input.nextLine();
									System.out.print("Enter Manager Name: ");
									String Empname1 = input.nextLine();
									System.out.print("Enter Educational Background : ");
									String EducationBG1 = input.nextLine();
									System.out.print("Enter Salary      :");
									double salary1=0.0;
									try{
										salary1 = input.nextDouble();
									}
									catch(Exception y){
 		System.out.println("******Please enter Double Number!!!**********");
 	}
 	input.nextLine();
									input.nextLine();
									System.out.print("Enter Nationality :");
									String Nationality1 = input.nextLine();
									System.out.print("Enter Home Town   :");
									String HomeTown1 = input.nextLine();

			//##############################################################################################################################################################


					/*Formatter ManagerInfo = new Formatter(file5_path);
					ManagerInfo.format("Data for Manager "+EmpID1+"\n"+Empname1+"\n"+EducationBG1+"\n"+salary1+"\n"+Nationality1+"\n"+HomeTown1);
					ManagerInfo.close();*/


						        FileWriter ManagerInfo = new FileWriter(file5_path,true);
										BufferedWriter b = new BufferedWriter(ManagerInfo);
										b.write("\nData for Manager \nID : "+EmpID1+"\nName : "+Empname1+"\nEducational Background : "+EducationBG1+"\nSalary : "+salary1+"\nNationality : "+Nationality1+"\nHome Town : "+HomeTown1);
										b.newLine();
										b.close();
										ManagerInfo.close();


									Employee Em1 = new Manager(EmpID1,Empname1,EducationBG1,salary1,Nationality1,HomeTown1);

									if(hut.insertEmployee(Em1))
									{
										System.out.println(EmpID1 + " Has Been Added as Manager------");
									}
									else
									{
										System.out.println(EmpID1 + " Sorry! Can NOT be Added----");
									}

                   			     break;

								case 2:
							   		 System.out.println("-------------You Have Selected Remove Manager---------------");
							   		 System.out.println();
									input.nextLine();
									System.out.print("Enter The EMPID to remove a Manager: ");
									String empId2 = input.nextLine();

									Employee e2 = hut.searchEmployee(empId2);

									if(e2 != null)
									{
									if(hut.removeEmployee(e2))
									{
								    System.out.println("*** Manager Removed ***");
									}
									}
									else
									{
									System.out.println("*** Manager Can NOT be Removed ***");
									}

									break;

								case 3:
									System.out.println("Going Back...");
									repeat2=false;
									break;

         				   }

         			    }

         			    break;
         			case 2:
         				System.out.println("----------You Have Selected Staff Management--------------");
    	   					int button70=0;
    	   					boolean repeat70 = true;
         					while(repeat70){
         					System.out.println("       1.Add New Staff    ");
         					System.out.println("       2.Remove Staff     ");
         					System.out.println("       5.Go back          ");

         					System.out.print("Enter your choice : ");	
         					try{											//	Staff
         					button70 = input.nextInt();
         				}
         				catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
 	input.nextLine();
         					switch(button70){
         						case 1:
         							System.out.println("------------You Have selected Add New Staff---------------");
         							System.out.println();

									input.nextLine();
									System.out.print("Enter Staff ID  : ");
									String EmpID3 = input.nextLine();
									System.out.print("Enter Staff Name: ");
									String Empname3 = input.nextLine();
									System.out.print("Enter Educational Background : ");
									String EducationBG3 = input.nextLine();
									System.out.print("Enter Salary      :");
									double salary3=0.0;
		
									try{salary3 = input.nextDouble();}
																catch(Exception x){
 		System.out.println("******Please enter double Number!!!**********");
 	}
 	System.out.println();
 	

									input.nextLine();
									System.out.print("Enter Nationality :");
									String Nationality3 = input.nextLine();
									System.out.print("Enter Home Town   :");
									String HomeTown3 = input.nextLine();

					//#############################################################################################################################################

										        FileWriter StaffInfo = new FileWriter(file6_path,true);
														BufferedWriter StaffInput = new BufferedWriter(StaffInfo);
													//	StaffInput.write("Data for Staff \n"+EmpID3+Empname3+EducationBG3+salary3+Nationality3+HomeTown3);
														StaffInput.write("\nData for Staff \nID : "+EmpID3+"\nName : "+Empname3+"\nEducational Background : "+EducationBG3+"\nSalary : "+salary3+"\nNationality : "+Nationality3+"\nHome Town : "+HomeTown3);
														StaffInput.newLine();
														StaffInput.close();
														StaffInput.close();


									Employee st1 = new Staff(EmpID3,Empname3,EducationBG3,salary3,Nationality3,HomeTown3);


									if(hut.insertEmployee(st1))
									{
										System.out.println(EmpID3 + "  Has Been Added As Staff----");
									}
									else
									{
										System.out.println(EmpID3 + " Sorry!!! Staff Can NOT be Added----------");
									}

                   			     break;

								case 2:
							   		System.out.println("-------------You Have Selected Remove Staff---------------");
							   		 System.out.println();
								input.nextLine();
									System.out.print("Enter The EMPID to remove a Staff: ");
									String empId5 = input.nextLine();

									Employee e7 = hut.searchEmployee(empId5);

									if(e7 != null)
									{
									if(hut.removeEmployee(e7))
									{
								    System.out.println("*** Staff Removed ***");
									}
									}
									else
									{
									System.out.println("*** Staff Can NOT be Removed ***");
									}

									break;


								case 3:
									System.out.println("Going Back");
									repeat70=false;
									break;

         				}
         			}
         				break;

         				case 3:

         					System.out.println("----------You Have Selected Maid Management--------------");
    	   					int button90=0;
    	   					boolean repeat90 = true;
         					while(repeat90){
         					System.out.println("       1.Add New Maid    ");
         					System.out.println("       2.Remove Maid     ");
         					System.out.println("       3.Go back         ");

         					System.out.print("Enter your choice : ");
         					try{												//	Maid
         					button90 = input.nextInt();
         				}
         				catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	input.nextLine();
 	System.out.println();
         					switch(button90){
         						case 1:
         							System.out.println("------------You Have selected Add New Maid---------------");
         							System.out.println();

									input.nextLine();
									System.out.print("Enter Maid ID  : ");
									String EmpID10= input.nextLine();
									System.out.print("Enter Maid Name: ");
									String Empname10 = input.nextLine();
									System.out.print("Enter Educational Background : ");
									String EducationBG10 = input.nextLine();
									System.out.print("Enter Salary      :");
									double salary10=0.0;
									try{salary10 = input.nextDouble();}
									catch(Exception y)
									{
										System.out.println("******please enter double number******");
									}

									input.nextLine();
									System.out.print("Enter Nationality :");
									String Nationality10 = input.nextLine();
									System.out.print("Enter Home Town   :");
									String HomeTown10 = input.nextLine();
//###################################################################################################################################################
									FileWriter MaidInfo = new FileWriter(file7_path,true);
									BufferedWriter MaidData = new BufferedWriter(MaidInfo);
									MaidData.write("\nData for Maid \nID : "+EmpID10+"\nName : "+Empname10+"\nEducational Background : "+EducationBG10+"\nSalary : "+salary10+"\nNationality : "+Nationality10+"\nHome Town : "+HomeTown10);
									MaidData.newLine(); //for newline
									MaidData.close();
									MaidInfo.close();

									Employee md1 = new Maid(EmpID10,Empname10,EducationBG10,salary10,Nationality10,HomeTown10);

									if(hut.insertEmployee(md1))
									{
										System.out.println(EmpID10 + " Maid Has Been Added------------");
									}
									else
									{
										System.out.println(EmpID10 + " Maid Can NOT be Added------------");
									}

                   			     break;

								case 2:
							   		 System.out.println("-------------You Have Selected Remove Maid---------------");
							   		 System.out.println();
									input.nextLine();
									System.out.print("Enter The EMPID to remove a Maid: ");
									String empId20 = input.nextLine();

									Employee e20 = hut.searchEmployee(empId20);

									if(e20 != null)
									{
									if(hut.removeEmployee(e20))
									{
								    System.out.println("*** Maid Removed ***");
									}
									}
									else
									{
									System.out.println("*** Maid Can NOT be Removed ***");
									}

									break;


								case 3:
									System.out.println("Going Back....");
									repeat90=false;
									break;

         					}
         				}
         				break;

         				case 4:

         				 	System.out.println("Going Back.... ");
         					repeat69=false;
         					break;

        						}
         					}
         			break;

         			case 2:

         				System.out.println("-----------You Have Selected Room Management--------------");
         				int button5=0;
         				boolean repeat4=true;
         				while(repeat4){
         					System.out.println("       1.Add New Room    ");
         					System.out.println("       2.Remove Room     ");
         				    System.out.println("       3.Search Room     ");
         					System.out.println("       4.Show All        ");
         					System.out.println("       5.Go back         ");

         					System.out.print("Enter your choice : ");
         					try{
         					button5 = input.nextInt();
         				}
         				catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	input.nextLine();
 	System.out.println();

         					switch(button5){
         					case 1:
         						System.out.println("What type of room you want to add?");
         						int button6 =0;
         						boolean repeat5=true;
         						while(repeat5){
         							System.out.println("1.Single Room");
         							System.out.println("2.Double Room");
         							System.out.println("3.Go back");

         							System.out.print("Enter your choice : ");
         							try{
         							button6=input.nextInt();
         						}
         						catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
         							input.nextLine();

         							if(button6==1)
         							{
         								System.out.print("Enter Room number :");

         								String roomNumber=input.nextLine();
//#################################################################################################################################
									 FileWriter SingleRmInfo = new FileWriter(file8_path,true);
									 BufferedWriter SingleRmInput = new BufferedWriter(SingleRmInfo);
									 SingleRmInput.write("\nData for Room \nSingle Room Number : "+roomNumber);
									 SingleRmInput.newLine();
									 SingleRmInput.close();
									 SingleRmInfo.close();

         								Room sr= new SingleRoom();
         								sr.setRoomNumber(roomNumber);
         									if(hut.addRoom(sr))
										    {
												System.out.println("--------"+roomNumber + "   Number Room Has Been Added As Single Room------------");
											}
											else
											{
												System.out.println("--------"+roomNumber + "  Number room Can NOT be Added As Single Room -----------");
											}

         							}

         							else if(button6==2)
         							{
         								System.out.println("Enter Room number :");
         								String roomNumber=input.nextLine();
//#########################################################################################################################################################
												FileWriter DoubleRmInfo = new FileWriter(file8_path,true);
												BufferedWriter DoubleRmInput = new BufferedWriter(DoubleRmInfo);
												DoubleRmInput.write("\nData for Room \nDouble Room Number : "+roomNumber);
												DoubleRmInput.newLine();
												DoubleRmInput.close();
												DoubleRmInfo.close();

         								Room dr= new DoubleRoom();
         								dr.setRoomNumber(roomNumber);
         									if(hut.addRoom(dr))
										    {
												System.out.println("-----------"+roomNumber + "  Room Has Been Added As Double Room--------");
											}
											else
											{
												System.out.println("-------"+roomNumber + "  Room Can NOT be Added As Double room--------");
											}
         							}

         							else if(button6==3)
         							{
         								System.out.println("Going Back....");
         								repeat5=false;
         							}


         						}

         						break;
         					case 2:
								System.out.println("--------You Have Selected Remove Room---------");
								System.out.println();
								System.out.println("What type of room you want to remove?");
         						int button7=0;
         						boolean repeat6=true;
         					while (repeat6){
         							System.out.println("1.Single Room");
         							System.out.println("2.Double Room");
         							System.out.println("3.Go back");

         							System.out.print("Enter your choice : ");
         							try{
         							button7=input.nextInt();
         						}
         						catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
         							input.nextLine();
         							if(button7==1){

										System.out.print("Enter The Single Room number to remove a Room: ");

										String roomNumber10 = input.nextLine();

										Room sr2 = hut.searchRoom(roomNumber10);

										if(sr2 != null)
										{
										if(hut.removeRoom(sr2))
										{
								  			  System.out.println("*** Room Removed ***");
										}
										}
										else
										{
											System.out.println("*** Room Can NOT be Removed ***");
										}

							  		}

							  		else if(button7==2)
							  		{
							  			System.out.print("Enter The Double Room number to remove a Room: ");
										String roomNumber1 = input.nextLine();

										Room dr2 = hut.searchRoom(roomNumber1);

										if(dr2 != null)
										{
										if(hut.removeRoom(dr2))
										{
								  			  System.out.println("*** Room Removed ***");
										}
										}
										else
										{
											System.out.println("*** Room Can NOT be Removed ***");
										}
 
							  		}
							  		else if(button7==3){
							  			System.out.println("Going back");
							  			repeat6=false;
							  		}
							}

							break;
						case 3:
							System.out.println("You Have Selected Search Room Information");
							System.out.println();
								System.out.println("Which type of room you want to scearch?");
         						int button8=0;
         						boolean repeat7=true;
         						while(repeat7){
         							System.out.println("1.Single Room");
         							System.out.println("2.Double Room");
         							System.out.println("2.Go back");

         							System.out.print("Enter your choice : ");
         							try{
         							button8=input.nextInt();
         						}
         						catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
         							input.nextLine();
         							if(button8==1){

										System.out.print("Enter The Room number to search a Room: ");
										String Roomnumber2 = input.nextLine();

										Room sr3 = hut.searchRoom(Roomnumber2);

										if(sr3 != null)
										{
											System.out.println("*** Room Found ***");
											System.out.println("++++Showing the details of the employee+++++");
											sr3.showDetails();
										}
										else
										{
											System.out.println("*** Room NOT Found ***");
										}


         							}
         							else if(button8==2){
         								System.out.print("Enter The Room number to search a Room: ");
										String Roomnumber5 = input.nextLine();

										Room dr3 = hut.searchRoom(Roomnumber5);

										if(dr3 != null)
										{
											System.out.println("*** Room Found ***");
											System.out.println("++++Showing the details of the Double Rooms +++++");
											dr3.showDetails();
										}
										else
										{
											System.out.println("*** Room NOT Found ***");
										}
         							}
         							else if(button8==3){
         								System.out.println("Going Back");
         								repeat7=false;
         							}

         						}

         						break;

         					case 4:
         						System.out.println("You Have Selected Show All Room Information");
								System.out.println();
								hut.showAllRooms();

								break;

							case 5:

								System.out.println("Going Back...........");
								repeat4 = false;
								System.out.println();
								break;

         			       }
         				}

         				break;
         			case 3:
         					System.out.println("---------You Have Selected Search Employee-------------");
									System.out.println();
									System.out.print("Enter The EmpID to search a Employee: ");
									String empId30 = input.nextLine();

									Employee e30= hut.searchEmployee(empId30);

									if(e30 != null)
									{
										System.out.println("*** Employee Found ***");
										System.out.println("++++Showing the details of the Employee +++++");
										e30.showDetails();
									}
									else
									{
										System.out.println("*** Employee NOT Found ***");
									}

									break;

					case 4:

						System.out.println("----------You Have Selected Show All Employee-------------");
						System.out.println();
						hut.showAllEmployees();
						//########################################################################################################################################################



						break;





         			case 5 :
         				System.out.println("Going back...");
         				repeat1=false;
         				break;


         		}
         	}

         }
         else
        {
            System.out.println("!!!!!!!!!!!!!!Username or password Mismatch!!!!!!!!!!!!!!!!");
            System.out.println();
        }

        }

    else if(choice==2){

    	boolean repeat9 = true;
 			int button10=0;
 			while(repeat9){

 				System.out.println("***************          Which Type of Guest are you?        ******************");
 				System.out.println("						1.Foreigner                           ");
 				System.out.println("						2.Local                               ");
 				System.out.println("						3.Search a Guest                     ");
 				System.out.println("						4.Show all Guest                      ");
 				System.out.println("						5.Go Back                             ");
 				System.out.print("Enter your choice : ");
 				try{
         		button10=input.nextInt();
         	}
         	catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	input.nextLine();
 	System.out.println();
         		switch(button10){

         		case 1:
         			boolean repeat10=true;
         			int button11=0;
         			while(repeat10){
         		System.out.println("***************       What do you want to do?        ******************");
 				System.out.println("						1.Check in                            ");
 				System.out.println("						2.check out                           ");
 				System.out.println("						3.Go Back                             ");
 				System.out.print("Enter your choice : ");
 				try{
 				button11=input.nextInt();
 			}
 			catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
 				input.nextLine();
 				switch(button11){
 					case 1:
 						System.out.println("OHH WOW You want to check in <3");
 						System.out.println();

 						System.out.print("What is your Name sir ? ");
 						String Name=input.nextLine();
 						System.out.print("Enter your Phone number sir : ");
 						double phnNumber=0.0;
 						try{phnNumber=input.nextDouble();}
 						catch(Exception l)
 						{System.out.println("****** Please enter double number ******");}
 						input.nextLine();
 						System.out.print("Enter your Passport Number :");
 						double passportno=0.0;
 						try{passportno=input.nextDouble();}
 						catch(Exception l){
 							System.out.println("****** Please enter double number ******");
 						}
 						input.nextLine();
 						System.out.print(" What is your Nationality?");
 						String Nationality=input.nextLine();
//##############################################################################################################################################
                    FileWriter foreignerInfo = new FileWriter(file9_path,true);
										BufferedWriter foreignerData = new BufferedWriter(foreignerInfo);
										foreignerData.write("\nData for Foreigner X Check in\nName : "+Name+"\nPhone number : "+phnNumber+"\nPassport Number : "+passportno+"\nNationality : "+Nationality);
										foreignerData.newLine();
										foreignerData.close();
										foreignerInfo.close();

 						Guest tv=new Traveler(Name,phnNumber,passportno,Nationality);

 						if(hut.insertGuest(tv))
							{
								System.out.println(Name + " Sir check in succesfull-----------");
							}
							else
							{
								System.out.println(Name + "Sir check in unsuccesfull-----------");
							}
							break;
					case 2:
						System.out.println("-------Do you want to check out?-------");
						System.out.println();

						System.out.print("Enter your phone number to check out : ");
						double phnNumber2 = 0.0;
						try{phnNumber2 = input.nextDouble();}
						catch(Exception l){
							System.out.println("****** Please enter double number ******");
						}
						input.nextLine();
//######################################################################################################################################################
						FileWriter foreignerInfo2 = new FileWriter(file9_path,true);
						BufferedWriter foreignerData2 = new BufferedWriter(foreignerInfo2);
						foreignerData2.write("\nForeigner Data X Check Out\nPhone Number : "+phnNumber2);
						foreignerData2.newLine();
						foreignerData2.close();
						foreignerInfo2.close();

						Guest tv2 = hut.searchGuest(phnNumber2);

						if(tv2 != null)
						{
						if(hut.removeGuest(tv2))
						{
						    System.out.println("*** checked out Sucessfully ***");
						}
						}
						else
						{
							System.out.println("***Unsucessfull check out attempet ***");
						}

								break;
					case 3:
						System.out.println("Going Back....");
						repeat10=false;
						break;

 				}
         	}
         	break;
         	case 2:
         		boolean repeat11=true;
         			int button12=0;
         			while(repeat11){
         		System.out.println("***************       What do you want to do?        ******************");
 				System.out.println("						1.check in                            ");
 				System.out.println("						2.check out                           ");
 				System.out.println("						3.Go Back                             ");
 				System.out.print("Enter your choice : ");
 				try{
 				button12=input.nextInt();
 			}
 			catch(Exception x){
 		System.out.println("******Please enter Integer Number!!!**********");
 	}
 	System.out.println();
 				input.nextLine();
 				switch(button12){
 					case 1:
 						System.out.println("OHH WOW You want to check in <3");
 						System.out.println();

 						System.out.print("What is your Name sir ? ");
 						String Name=input.nextLine();
 						System.out.print("Enter your Phone number sir : ");
 						double phnNumber=0.0;
 						try{phnNumber=input.nextDouble();}
 						catch(Exception l){
 							System.out.println("****** Please enter double number ******");
 						}
 						System.out.print("Enter your National ID Number :");
 						double nid=0.0;
 						try{nid=input.nextDouble();}
 						catch(Exception l){
 							System.out.println("****** Please enter double number ******");
 						}
 						input.nextLine();
 						System.out.print(" What is your Hometown?");
						input.nextLine();
 						String Nationality=input.nextLine();

//##############################################################################################################################################
FileWriter localInfo = new FileWriter(file10_path,true);
BufferedWriter localData = new BufferedWriter(localInfo);
localData.write("\nLocal Data X Check in\nName : "+Name+"\nPhone number : "+phnNumber+"\nPassport Number : "+nid+"\nHome Town : "+Nationality);
localData.newLine();
localData.close();
localInfo.close();
 						Guest lg=new LocalGuest(Name,phnNumber,nid,Nationality);

 						if(hut.insertGuest(lg))
							{
								System.out.println(Name + " Sir check in succesfully------");
							}
							else
							{
								System.out.println(Name + "Sir check in unsuccesfull-----------");
							}
							break;
					case 2:
						System.out.println("----Do you want to check out?-----");
						System.out.println();

						System.out.print("Enter your phone number to check out : ");
						double phnNumber2 = 0.0;
						try{phnNumber2 = input.nextDouble();}
						catch(Exception l){
 							System.out.println("****** Please enter double number ******");
 						}
//########################################################################################################################################
FileWriter localInfo2 = new FileWriter(file10_path,true);
BufferedWriter localData2 = new BufferedWriter(localInfo2);
localData2.write("\nLocal Data X Check Out\nPhone Number : "+phnNumber2);
localData2.newLine();
localData2.close();
localInfo2.close();
						Guest  lg2 = hut.searchGuest(phnNumber2);

						if(lg2 != null)
						{
						if(hut.removeGuest(lg2))
						{
						    System.out.println("*** checked out Sucessfull ***");
						}
						}
						else
						{
							System.out.println("*** Unsucessfull check out attempet  ***");
						}

								break;
					case 3:
						System.out.println("Going Back....");
						repeat11=false;
						break;

 				}
         	  }
         	 break;

case 3:
         					System.out.println("---------You Have Selected Search Guest-------------");
									System.out.println();
									System.out.print("Enter The Phone Number of the guest to search a Guest: ");
									double gst0 = 0.0;
									try{
									gst0=input.nextDouble();
								}
								catch(Exception t){
									System.out.println("*****Enter double Value*******");
								}
								input.nextLine();
									Guest g3= hut.searchGuest(gst0);

									if(g3 != null)
									{
										System.out.println("*** Guest Found ***");
										System.out.println("++++Showing the details of the Guest +++++");
										g3.showDetails();
									}
									else
									{
										System.out.println("*** Guest NOT Found ***");
									}

									break;

					case 4:

						System.out.println("----------You Have Selected Show All Guest-------------");
						System.out.println();
						hut.showAllGuests();
						//########################################################################################################################################################



						break;

         	case 5:
         		System.out.println("Going back.....");
         		repeat9=false;
         		break;

          	}
        }

	}


   else if(choice==3)
    	{
    		System.out.println("Thanks for bing with us <3");
    		System.out.println("Exiting.....");
    		System.exit(0);
    	}

 	  }


//
}catch(Exception f1){
	System.out.println(f1);
}

}
}
