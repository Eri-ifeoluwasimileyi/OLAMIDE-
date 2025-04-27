import java.util.Scanner;

public class NokiaModified {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 

int userInput = -1;
while(userInput != 0){

	String Nokia = """
	Welcome to Nokia
	MENU
	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services
	0.  Switch off

	             """;	


	System.out.println(Nokia);
	userInput = input.nextInt();

	switch(userInput) {
		
		case 1: 

			int customerInput1 = -1;
			while(customerInput1 != 0){

			String Phonebook = """
			Phone Book
			1. Search
			2. Service Nos.
			3. Add name
			4. Erase
			5. Edit
			6. Assign tone
			7. Send b'card
			8. Options
			9. Speed dials
			10. Voice tags
			0. Press 0 to go back
					""";

			System.out.println(Phonebook);
			customerInput1 = input.nextInt();
			
			switch(customerInput1) {


			case 1: 

				int search = -1;
				while(search != 0){

					System.out.println("Search");
					System.out.println("Press 0 to go back");
		
					search = input.nextInt();

					switch(search){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 2: 

				int serviceNos = -1;
				while(serviceNos != 0){

					System.out.println("Service Nos.");
					System.out.println("Press 0 to go back");
		
					serviceNos = input.nextInt();

					switch(serviceNos){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 3: 

				int addName = -1;
				while(addName != 0){

					System.out.println("Add name");
					System.out.println("Press 0 to go back");
		
					addName = input.nextInt();

					switch(addName){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	



			case 4: 

				int erase = -1;
				while(erase != 0){

					System.out.println("Erase");
					System.out.println("Press 0 to go back");
		
					erase = input.nextInt();

					switch(erase){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 5: 

				int edit = -1;
				while(edit != 0){

					System.out.println("Edit");
					System.out.println("Press 0 to go back");
		
					edit = input.nextInt();

					switch(edit){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 6: 

				int assignTone = -1;
				while(assignTone != 0){

					System.out.println("Assign tone");
					System.out.println("Press 0 to go back");
		
					assignTone = input.nextInt();

					switch(assignTone){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	

	
			case 7: 

				int sendBcard = -1;
				while(sendBcard != 0){

					System.out.println("Send b'card");
					System.out.println("Press 0 to go back");
		
					sendBcard = input.nextInt();

					switch(sendBcard){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


		
			case 8: 


				int userInput2 = -1;
				while(userInput2 != 0){


				String Options = """
				Options
				1. Type of view
				2. Memory status
				0. Press 0 to go back
						""";

				System.out.println(Options);
				userInput2 = input.nextInt(); 

				switch(userInput2) {


					case 1: 

						int typeOfView = -1;
						while(typeOfView != 0){

						System.out.println("Type of view");
						System.out.println("Press 0 to go back");
		
						typeOfView = input.nextInt();

						switch(typeOfView){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 2:

						int memoryStatus = -1;
						while(memoryStatus != 0){

						System.out.println("Memory status");
						System.out.println("Press 0 to go back");
		
						memoryStatus = input.nextInt();

						switch(memoryStatus){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	


				
					default: System.out.println("Invalid Input");
					}
				
				}
				break;

			case 9: 

				int speedDials = -1;
				while(speedDials != 0){

					System.out.println("Speed dials");
					System.out.println("Press 0 to go back");
		
					speedDials = input.nextInt();

					switch(speedDials){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


		
			case 10: 

				int voiceTags = -1;
				while(voiceTags != 0){

					System.out.println("Voice tags");
					System.out.println("Press 0 to go back");
		
					voiceTags = input.nextInt();

					switch(voiceTags){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


	
			
			default: System.out.println("Invalid Input");
				
			}	
		
		}
		break;


		case 2: 

			int customerInput2 = -1;
			while(customerInput2 != 0){

			
				String Messages = """
				Messages
				1. Write messages
				2. Inbox
				3. Outbox
				4. Picture messages
				5. Templates
				6. Smileys
				7. Message settings
				8. Info service
				9. Voice mailbox number
				10. Service commnad editor
				0. Press 0 to go back
							""";

				System.out.println(Messages);
				customerInput2 = input.nextInt();
			
				switch(customerInput2) {



				case 1:

					int writeMessages = -1;
					while(writeMessages != 0){

						System.out.println("Write messages");
						System.out.println("Press 0 to go back");
		
						writeMessages = input.nextInt();

						switch(writeMessages){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;



				case 2: 

					int inbox = -1;
					while(inbox != 0){

						System.out.println("Inbox");
						System.out.println("Press 0 to go back");
		
						inbox = input.nextInt();

						switch(inbox){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;


				case 3: 

					int outbox = -1;
					while(outbox != 0){

						System.out.println("Outbox");
						System.out.println("Press 0 to go back");
		
						outbox = input.nextInt();

						switch(outbox){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;



				case 4: 

					int pictureMessages = -1;
					while(pictureMessages != 0){

						System.out.println("Picture Messages");
						System.out.println("Press 0 to go back");
		
						pictureMessages = input.nextInt();

						switch(pictureMessages){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;


	
				case 5: 

					int templates = -1;
					while(templates != 0){

						System.out.println("Templates");
						System.out.println("Press 0 to go back");
		
						templates = input.nextInt();

						switch(templates){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;



				case 6: 

					int smileys = -1;
					while(smileys != 0){

						System.out.println("Smileys");
						System.out.println("Press 0 to go back");
		
						smileys = input.nextInt();

						switch(smileys){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;





	
				case 7: 

				
					int userInput3 = -1;
					while(userInput3 != 0){	

						String Messagesettings = """
						Message settings
						1. Set 1
						2. Common
						0. Press 0 to go back
							""";
						System.out.println(Messagesettings);
						userInput3 = input.nextInt();


						switch(userInput3) {



						case 1:

							int set = -1;
							while(set != 0){

								String Set1 = """
								Set 1
								1. Message center number
								2. Messages sent as
								3. Message validity
								0. Press 0 to go back
										""";


								System.out.println(Set1);
								set = input.nextInt(); 
	
								switch(set) {


								case 1:

									int messageCenter = -1;
									while(messageCenter != 0){

										System.out.println("Message center number");
										System.out.println("Press 0 to go back");
		
										messageCenter = input.nextInt();

										switch(messageCenter){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;
			




								case 2: 

									int messageSent = -1;
									while(messageSent != 0){

										System.out.println("Message sent as");
										System.out.println("Press 0 to go back");
		
										messageSent = input.nextInt();
	
										switch(messageSent){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;



								case 3: 

									int messageValidity = -1;
									while(messageValidity != 0){

										System.out.println("Message validity");
										System.out.println("Press 0 to go back");
		
										messageValidity = input.nextInt();

										switch(messageValidity){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;


								case 0: break;
								default: System.out.println("Invalid Input"); 
								}
							

							}
							break;




						
						case 2: 

							int common = -1;
							while(common != 0){


								String Common = """
								Common
								1. Delivery reports
								2. Reply via same centre
								3. Character support
								0. Press 0 to go back
									""";
								System.out.println(Common);
								common = input.nextInt(); 
	
								switch(common) {


	
								case 1: 

									int deliveryReports = -1;
									while(deliveryReports != 0){

										System.out.println("Delivery reports");
										System.out.println("Press 0 to go back");
		
										deliveryReports = input.nextInt();

										switch(deliveryReports){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;



								case 2: 

									int replyVia = -1;
									while(replyVia != 0){

										System.out.println("Reply via same centre");
										System.out.println("Press 0 to go back");
			
										replyVia = input.nextInt();

										switch(replyVia){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;



								case 3: 

									int characterSupport = -1;
									while(characterSupport != 0){

										System.out.println("Character support");
										System.out.println("Press 0 to go back");
		
										characterSupport = input.nextInt();

										switch(characterSupport){
				
										case 0: break;

										default: System.out.println("Invalid input");

										}

									}
									break;


								case 0: break;
								default: System.out.println("Invalid Input");
								}


							}
							break;							

						case 0: break;
						default: System.out.println("Invalid Input");
						}//message setttings switch
							
				
					}//message settings while loop
					break;
					
			case 8: 

				int infoService = -1;
				while(infoService != 0){

						System.out.println("Info services");
						System.out.println("Press 0 to go back");
		
						infoService = input.nextInt();

						switch(infoService){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;



			case 9: 

				int voiceMail = -1;
				while(voiceMail != 0){

						System.out.println("Voice mailbox number");
						System.out.println("Press 0 to go back");
		
						voiceMail = input.nextInt();

						switch(voiceMail){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;



			case 10: 

				int serviceCommand = -1;
				while(serviceCommand != 0){

						System.out.println("Service command editor");
						System.out.println("Press 0 to go back");
		
						serviceCommand = input.nextInt();

						switch(serviceCommand){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}
						break;
					
					}

			case 0: break;
			default: System.out.println("Invalid input");
			}
			
		
		}
		break;
	
		

	
		case 3:  
			int chats = -1;
			while(chats != 0){

				System.out.println("Chats");
				System.out.println("Press 0 to go back");
		
				chats = input.nextInt();

				switch(chats){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	
		


		case 4: 

			int customerInput4 = -1;
			while(customerInput4 != 0){


			String CallRegister = """
			Call Register
			1. Missed calls
			2. Received calls
			3. Dialled calls
			4. Erase recent call lists
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			0. Press 0 to go back
					""";


			System.out.println(CallRegister);
			customerInput4 = input.nextInt(); 
	
			switch(customerInput4) {


			case 1: 

				int missedCalls = -1;
				while(missedCalls != 0){

					System.out.println("Missed calls");
					System.out.println("Press 0 to go back");
		
					missedCalls = input.nextInt();

					switch(missedCalls){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;



			case 2: 

				int receivedCalls = -1;
				while(receivedCalls != 0){

					System.out.println("Received calls");
					System.out.println("Press 0 to go back");
		
					receivedCalls = input.nextInt();

					switch(receivedCalls){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;




			case 3: 

				int dialledNumbers = -1;
				while(dialledNumbers != 0){

					System.out.println("Dialled numbers");
					System.out.println("Press 0 to go back");
		
					dialledNumbers = input.nextInt();

					switch(dialledNumbers){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;




			case 4: 

				int eraseRecent = -1;
				while(eraseRecent != 0){

					System.out.println("Erase recent call lists");
					System.out.println("Press 0 to go back");
		
					eraseRecent = input.nextInt();

					switch(eraseRecent){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;
				
			
			

			case 5:

				int showcallduration = -1;
				while(showcallduration != 0){

					String Showcallduration = """
					Show call duration 
					1. Last call duration
					2. All calls' duration
					3. Received calls' duration
					4. Dialled calls' duration
					5. Clear timers 
					0. Press 0 to go back
							""";
					System.out.println(Showcallduration);
					showcallduration = input.nextInt(); 
	
					switch(showcallduration) {



					case 1: 

						int lastCallD = -1;
						while(lastCallD != 0){

							System.out.println("Last call duration");
							System.out.println("Press 0 to go back");
		
							lastCallD = input.nextInt();

							switch(lastCallD){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


 
					case 2: 

						int allCallD = -1;
						while(allCallD != 0){

							System.out.println("All calls' duration");
							System.out.println("Press 0 to go back");
		
							allCallD = input.nextInt();

							switch(allCallD){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;



					case 3: 

						int receiveCallD = -1;
						while(receiveCallD != 0){

							System.out.println("Received calls' duration");
							System.out.println("Press 0 to go back");
		
							receiveCallD = input.nextInt();

							switch(receiveCallD){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;



					case 4: 

						int dialledCallD = -1;
						while(dialledCallD != 0){

							System.out.println("Dialled calls' duration");
							System.out.println("Press 0 to go back");
		
							dialledCallD = input.nextInt();

							switch(dialledCallD){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;



					case 5: 

						int clearTimers = -1;
						while(clearTimers != 0){

							System.out.println("Clear timers");
							System.out.println("Press 0 to go back");
		
							clearTimers = input.nextInt();

							switch(clearTimers){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


					case 0: break;
					default: System.out.println("Invalid input"); 
					}
					
				}
				break;


			case 6:
					

				int showcallCost = -1;
				while(showcallCost != 0){

					String ShowcallCost = """
					Show call Cost
					1. Last call cost
					2. All calls' cost
					3. Clear counters
					0. Press 0 to go back
							""";


					System.out.println(ShowcallCost);
					showcallCost = input.nextInt(); 
	
					switch(showcallCost) {



					case 1: 

						int lastCallCost = -1;
						while(lastCallCost != 0){

							System.out.println("Last call Cost");
							System.out.println("Press 0 to go back");
		
							lastCallCost = input.nextInt();

							switch(lastCallCost){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


 
					case 2: 

						int allCallCost = -1;
						while(allCallCost != 0){

							System.out.println("All calls' cost");
							System.out.println("Press 0 to go back");
		
							allCallCost = input.nextInt();

							switch(allCallCost){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;



					case 3: 

						int clearCounters = -1;
						while(clearCounters != 0){

							System.out.println("Clear counters");
							System.out.println("Press 0 to go back");
		
							clearCounters = input.nextInt();

							switch(clearCounters){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


					case 0: break;
					default: System.out.println("Invalid input"); 
					}
					
				}
				break;



				

			case 7:


				int callCostSettings = -1;
				while(callCostSettings != 0){

					String Callcostsettings = """
					Call cost settings 
					1. Call cost limit
					2. Show costs in
							""";

					System.out.println(Callcostsettings);
					callCostSettings = input.nextInt(); 
	
					switch(callCostSettings) {



					case 1: 

						int callCostLimits = -1;
						while(callCostLimits != 0){

							System.out.println("Call cost limits");
							System.out.println("Press 0 to go back");
		
							callCostLimits = input.nextInt();

							switch(callCostLimits){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


 
					case 2: 

						int showCosts = -1;
						while(showCosts != 0){

							System.out.println("Show costs in");
							System.out.println("Press 0 to go back");
		
							showCosts = input.nextInt();

							switch(showCosts){
				
							case 0: break;

							default: System.out.println("Invalid input");

							}

						}
						break;


					case 0: break;
					default: System.out.println("Invalid input"); 
					}
					
				}
				break;



				


			case 8: 

				int prepaidCredit = -1;
				while(prepaidCredit != 0){

					System.out.println("Prepaid credit");
					System.out.println("Press 0 to go back");
		
					prepaidCredit = input.nextInt();

					switch(prepaidCredit){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;
							
			
			case 0: break;

			default: System.out.println("Invalid input");

			}//Call register end switch

		}//Call register while loop end
		break;






		case 5: 

			int customerInput5 = -1;
			while(customerInput5 != 0){


			String Tones = """
			Tones
			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Composer
			5. Message alert tone
			6. Keypad tones
			7. Warning and games tones
			8. Vibrating alert
			9. Screen saver
			0. Press 0 to go back
					""";

			System.out.println(Tones);
			customerInput5 = input.nextInt();
			
			switch(customerInput5) {



			case 1: 

				int ringingTone = -1;
				while(ringingTone != 0){

					System.out.println("Ringing tone");
					System.out.println("Press 0 to go back");
		
					ringingTone = input.nextInt();

					switch(ringingTone){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	

			case 2:

				int ringingVolume = -1;
				while(ringingVolume != 0){

					System.out.println("Ringing Volume");
					System.out.println("Press 0 to go back");
		
					ringingVolume = input.nextInt();

					switch(ringingVolume){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;		


			case 3: 

				int incomingCall = -1;
				while(incomingCall != 0){

					System.out.println("Incoming call alert");
					System.out.println("Press 0 to go back");
		
					incomingCall = input.nextInt();

					switch(incomingCall){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 4: 

				int composer = -1;
				while(composer != 0){

					System.out.println("Composer");
					System.out.println("Press 0 to go back");
		
					composer = input.nextInt();

					switch(composer){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 5:

				int messageAlert = -1;
				while(messageAlert != 0){

					System.out.println("Message alert tone");
					System.out.println("Press 0 to go back");
		
					messageAlert = input.nextInt();

					switch(messageAlert){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 6:

				int keypadTones = -1;
				while(keypadTones != 0){

					System.out.println("Keypad tones");
					System.out.println("Press 0 to go back");
		
					keypadTones = input.nextInt();

					switch(keypadTones){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	

	
			case 7:

				int warningGames = -1;
				while(warningGames != 0){

					System.out.println("Warning and games tones");
					System.out.println("Press 0 to go back");
		
					warningGames = input.nextInt();

					switch(warningGames){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 8: 

				int vibratingAlert = -1;
				while(vibratingAlert != 0){

					System.out.println("Vibrating Alert");
					System.out.println("Press 0 to go back");
		
					vibratingAlert = input.nextInt();

					switch(vibratingAlert){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 9: 

				int screenSaver = -1;
				while(screenSaver != 0){

					System.out.println("Screen saver");
					System.out.println("Press 0 to go back");
		
					screenSaver = input.nextInt();

					switch(screenSaver){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	

			default: System.out.println("Invalid Input");

			}
			
		
		}
		break;



		case 6: 

			int customerInput6 = -1;
			while(customerInput6 != 0){



			String Settings = """
			Settings
			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			0. Press 0 to go back
						""";

			System.out.println(Settings);
			customerInput6 = input.nextInt();
			
			switch(customerInput6) {



			case 1:

				int userInput7 = -1;
				while(userInput7 != 0){


				String Callsettings = """
					Call settings 
					1. Automatic redial
					2. Speed dialling
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer
					0. Press 0 to go back
							""";


					System.out.println(Callsettings);
					userInput7 = input.nextInt(); 
	
				switch(userInput7) {



					case 1: 

						int automaticRedial = -1;
						while(automaticRedial != 0){

						System.out.println("Automatic redial");
						System.out.println("Press 0 to go back");
		
						automaticRedial = input.nextInt();

						switch(automaticRedial){
				
						case 0: break;
	
						default: System.out.println("Invalid input");
						
						}

					}
					break;	



					case 2: 

						int speedDialling = -1;
						while(speedDialling != 0){

						System.out.println("Speed dialling");
						System.out.println("Press 0 to go back");
		
						speedDialling = input.nextInt();

						switch(speedDialling){
				
						case 0: break;

						default: System.out.println("Invalid input");
						
						}

					}
					break;	



					case 3: 

						int callWaiting = -1;
						while(callWaiting != 0){

						System.out.println("Call waiting options");
						System.out.println("Press 0 to go back");
		
						callWaiting = input.nextInt();

						switch(callWaiting){
				
						case 0: break;

						default: System.out.println("Invalid input");
						
						}
	
					}
					break;	


					case 4: 

						int ownNumber = -1;
						while(ownNumber != 0){

						System.out.println("own number sending");
						System.out.println("Press 0 to go back");
			
						ownNumber = input.nextInt();

						switch(ownNumber){
				
						case 0: break;

						default: System.out.println("Invalid input");
						
						}

					}
					break;	



					case 5: 

						int phoneLine = -1;
						while(phoneLine != 0){

						System.out.println("Phone line in use");
						System.out.println("Press 0 to go back");
		
						phoneLine = input.nextInt();

						switch(phoneLine){
				
						case 0: break;

						default: System.out.println("Invalid input");
						
						}

					}
					break;	


					case 6: 

						int automaticAnswer = -1;
						while(automaticAnswer != 0){

						System.out.println("Automatic answer");
						System.out.println("Press 0 to go back");
			
						automaticAnswer = input.nextInt();

						switch(automaticAnswer){
				
						case 0: break;

						default: System.out.println("Invalid input");
	
						}
	
					}
					break;	


					case 0: break;


					default: System.out.println("Invalid input"); 
					}
					
				}
				break;

			case 2:

				int userInput8 = -1;
				while(userInput8 != 0){


				String Phonesettings = """
				Phone settings 
				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Lights
				6. Confirm SIM service actions
				0. Press 0 to go back
							""";

				System.out.println(Phonesettings);
				userInput8 = input.nextInt(); 
	
				switch(userInput8) {


					case 1:

						int language = -1;
						while(language != 0){

						System.out.println("Language");
						System.out.println("Press 0 to go back");
		
						language = input.nextInt();

						switch(language){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 2: 

						int cellInfo = -1;
						while(cellInfo != 0){

						System.out.println("Cell info dispaly");
						System.out.println("Press 0 to go back");
		
						cellInfo = input.nextInt();

						switch(cellInfo){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 3:

						int welcomeNote = -1;
						while(welcomeNote != 0){

						System.out.println("Welcome note");
						System.out.println("Press 0 to go back");
		
						welcomeNote = input.nextInt();

						switch(welcomeNote){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 4: 

						int networkSelection = -1;
						while(networkSelection != 0){

						System.out.println("Network selection");
						System.out.println("Press 0 to go back");
		
						networkSelection = input.nextInt();

						switch(networkSelection){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 5: 

						int lights = -1;
						while(lights != 0){

						System.out.println("Lights");
						System.out.println("Press 0 to go back");
		
						lights = input.nextInt();
	
						switch(lights){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	



					case 6:

						int confirmSim = -1;
						while(confirmSim != 0){

						System.out.println("Confirm SIM service actions");
						System.out.println("Press 0 to go back");
		
						confirmSim = input.nextInt();

						switch(confirmSim){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	


					case 0: break;


					default: System.out.println("Invalid input"); 
					}
				
				}
				break;

			case 3: 

				int userInput9 = -1;
				while(userInput9 != 0) {

				
					String Securitysettings = """
					Security settings
					1. PIN code request
					2. Call barring service
					3. Fixed dialling
					4. Closed user group
					5. Phone security
					6. Change access codes
					0. Press 0 to go back
							""";


					System.out.println(Securitysettings);
					userInput9 = input.nextInt(); 
	
					switch(userInput9) {



					case 1: 

						int pinCode = -1;
						while(pinCode != 0){

						System.out.println("PIN code request");
						System.out.println("Press 0 to go back");
		
						pinCode = input.nextInt();

						switch(pinCode){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




					case 2: 

						int callBarring = -1;
						while(callBarring != 0){

						System.out.println("Call barring service");
						System.out.println("Press 0 to go back");
		
						callBarring = input.nextInt();

						switch(callBarring){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




					case 3: 

						int fixedDialling = -1;
						while(fixedDialling != 0){

						System.out.println("Fixed dialling");
						System.out.println("Press 0 to go back");
		
						fixedDialling = input.nextInt();

						switch(fixedDialling){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




					case 4: 

						int closedUser = -1;
						while(closedUser != 0){

						System.out.println("Closed user group");
						System.out.println("Press 0 to go back");
		
						closedUser = input.nextInt();

						switch(closedUser){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




					case 5: 

						int phoneSecurity = -1;
						while(phoneSecurity != 0){

						System.out.println("Phone security");
						System.out.println("Press 0 to go back");
		
						phoneSecurity = input.nextInt();

						switch(phoneSecurity){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




					case 6: 

						int changeAccess = -1;
						while(changeAccess != 0){

						System.out.println("Change access codes");
						System.out.println("Press 0 to go back");
		
						changeAccess = input.nextInt();

						switch(changeAccess){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	


					case 0: break;


					default: System.out.println("Invalid input"); 
					}
					
				}
				break;
				

			case 4: 

				int restoreFactory = -1;
				while(restoreFactory != 0){

					System.out.println("Restore factory settings");
					System.out.println("Press 0 to go back");
		
					restoreFactory = input.nextInt();

					switch(restoreFactory){
				
					case 0: break;

					default: System.out.println("Invalid input");

					}

				}
				break;	


			case 0: break;


			default: System.out.println("Invalid Input");

			}
		
		
		}
		break;



		case 7: 

			int customerInput7 = -1;
			while(customerInput7 != 0){

				System.out.println("Call divert");
				System.out.println("Press 0 to go back");

				customerInput7 = input.nextInt();

				switch(customerInput7){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	
		

		case 8: 
	
			int customerInput8 = -1;
			while(customerInput8 != 0){

				System.out.println("Games");
				System.out.println("Press 0 to go back");

				customerInput8 = input.nextInt();

				switch(customerInput8){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	

		case 9: 

			int customerInput9 = -1;
			while(customerInput9 != 0){

				System.out.println("Calculator");
				System.out.println("Press 0 to go back");

				customerInput9 = input.nextInt();

				switch(customerInput9){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	

		case 10:

			int customerInput10 = -1;
			while(customerInput10 != 0){

				System.out.println("Remainder");
				System.out.println("Press 0 to go back");

				customerInput10 = input.nextInt();

				switch(customerInput10){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	
		

		case 11: 

			
			int customerInput11 = -1;
			while(customerInput11 != 0){


				String Clock = """
				Clock
				1. Alarm clock
				2. Clock settings
				3. Date setting
				4. Stopwatch
				5. Countdown timer
				6. Auto update of date and time
				0. Press 0 to go back
							""";

				System.out.println(Clock);
				customerInput11 = input.nextInt();
			
				switch(customerInput11) {



				case 1: 


					int alarmClock = -1;
					while(alarmClock != 0){

						System.out.println("Alarm Clock");
						System.out.println("Press 0 to go back");
		
						alarmClock = input.nextInt();

						switch(alarmClock){
				
						case 0: break;
						default: System.out.println("Invalid input");

						}

					}
					break;	



				case 2: 

					int clockSettings = -1;
					while(clockSettings != 0){

						System.out.println("Clock settings");
						System.out.println("Press 0 to go back");
		
						clockSettings = input.nextInt();

						switch(clockSettings){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	




				case 3: 

					int dateSettings = -1;
					while(dateSettings != 0){

						System.out.println("Date settings");
						System.out.println("Press 0 to go back");
		
						dateSettings = input.nextInt();

						switch(dateSettings){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	


	
				case 4: 

					int stopWatch = -1;
					while(stopWatch != 0){

						System.out.println("Stopwatch");
						System.out.println("Press 0 to go back");
		
						stopWatch = input.nextInt();

						switch(stopWatch){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;

	
				case 5: 

					int countDownTimer = -1;
					while(countDownTimer != 0){

						System.out.println("Countdown timer");
						System.out.println("Press 0 to go back");
		
						countDownTimer = input.nextInt();

						switch(countDownTimer){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	


				case 6:

					int autoUpdate = -1;
					while(autoUpdate != 0){

						System.out.println("Auto update of date and time");
						System.out.println("Press 0 to go back");
		
						autoUpdate = input.nextInt();

						switch(autoUpdate){
				
						case 0: break;

						default: System.out.println("Invalid input");

						}

					}
					break;	

				case 0: break;








				default: System.out.println("Invalid Input");

				}

			}
			break;
		

		case 12: 

			int customerInput12 = -1;
			while(customerInput12 != 0){

				System.out.println("Profiles");
				System.out.println("Press 0 to go back");

				customerInput12 = input.nextInt();

				switch(customerInput12){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;	



		case 13:

			int customerInput13 = -1;
			while(customerInput13 != 0){

				System.out.println("SIM services");
				System.out.println("Press 0 to go back");

				customerInput13 = input.nextInt();

				switch(customerInput13){
				
				case 0: break;

				default: System.out.println("Invalid input");

				}

			}
			break;		
	
			
		case 0: break;

		default: System.out.println("Invalid input");


 
	}//ends main switch


		
}//ends main while loop

	System.out.println("Goodbye, Thank you for choosing Nokia.");




}
} 
