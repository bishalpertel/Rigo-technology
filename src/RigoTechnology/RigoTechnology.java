package RigoTechnology;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RigoTechnology
{
    ArrayList<Developer> developerArrayList = new ArrayList<Developer>();

    boolean isadd=false;


    private RigoTechnology(){
        //Show Main Window
        openMainWindow();
    }

    private void openMainWindow(){
        //the main window that opens at begining
        int fWidth = 400, fHeight = 200;
        final JFrame frame = new JFrame("Rigo Technology");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fWidth, fHeight);

        //Adding UI
        {//First Label
            JLabel label = new JLabel("Welcome To Rig Technology");
            label.setBounds(100, 30, 400, 30);
            frame.add(label);
        }

        {//Second Label
            JLabel label = new JLabel("Please Choose One");
            label.setBounds(125, 60, 400, 30);
            frame.add(label);
        }

        {//First Button
            JButton btn = new JButton("Appoint");
            btn.setBounds(90, 100, 100, 30);
            btn.addActionListener(e ->{
                openAppointmentWindow();
                frame.dispose();//closes this window after opening the new window
            });
            frame.add(btn);
        }

        {//Second Button
            JButton btn = new JButton("Terminate");
            btn.setBounds(210, 100, 100, 30);
            btn.addActionListener( e-> {
                openTerminateWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        frame.setVisible(true);
    }

    private void openTerminateWindow(){
        int fWidth = 500, fHeight = 200;

        final JFrame frame = new JFrame("Terminate System");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fWidth, fHeight);

        JTextField textField = new JTextField();

        //Adding UI
        {//First Label
            JLabel label = new JLabel("Developer Index ");
            label.setBounds(10, 30, 130, 30);
            frame.add(label);
        }
        {//First TextField
            textField.setBounds(130, 30, 270, 30);
            frame.add(textField);
        }
        {//First Button
            JButton btn = new JButton("Terminate");
            btn.setBounds(10, 100, 130, 30);
            btn.addActionListener(e ->  {
                //terminates the senior developer only as in fucntion
                try{
                    int index = Integer.parseInt(textField.getText());

                    if(index >= 0 && index < developerArrayList.size()){
                        //developerArrayList.remove(index);
                        try {
                            SeniorDeveloper seniorDeveloper = (SeniorDeveloper) developerArrayList.get(index);
                            seniorDeveloper.contractTermination();
                            Msg(frame, "Info", "Terminated!");
                        }
                        catch (Exception ex){
                            //..
                            //System.out.println(ex.toString());
                            Msg(frame, "Error", "Enter Appropriate value");
                        }
                    }
                    else{
                        Msg(frame, "Error", "Enter Appropriate value");//displays error message
                    }

                }
                catch(Exception ex){
                    Msg(frame, "Error", "Enter Index No:");
                }

            });
            frame.add(btn);
        }
        {//Second Button
            JButton btn = new JButton("Clear");
            btn.setBounds(145, 100, 130, 30);
            btn.addActionListener(e -> {
                textField.setText("");
            });
            frame.add(btn);
        }
        {//Third Button
            JButton btn = new JButton("Back");
            btn.setBounds(280, 100, 95, 30);
            btn.addActionListener(e -> {
                openMainWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        {//fourth button
            JButton btn = new JButton("display");
            btn.setBounds(375, 100, 100, 30);
            btn.addActionListener(e -> {
                openDisplayWindow(1,"Senior Developer");
            });
            frame.add(btn);
        }
        frame.setVisible(true);
    }

    private void openAppointmentWindow(){
        int fWidth = 450, fHeight = 200;

        final JFrame frame = new JFrame("Appointment System");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fWidth, fHeight);

        //Adding UI
        {//First Label
            JLabel label = new JLabel("Please Choose An Options");
            label.setBounds(150, 50, 400, 30);
            frame.add(label);
        }

        //Buttons UI
        {//First Button
            JButton btn = new JButton("Senior Developer");
            btn.setBounds(10, 100, 150, 30);
            btn.addActionListener(e ->  {
                openSeniorWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        {//Second Button
            JButton btn = new JButton("Junior Developer");
            btn.setBounds(170, 100, 150, 30);
            btn.addActionListener(e -> {
                openJuniorWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        {//Third Button
            JButton btn = new JButton("Back");
            btn.setBounds(330, 100, 95, 30);
            btn.addActionListener(e -> {
                openMainWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        frame.setVisible(true);
    }

    private void openSeniorWindow(){
        isadd=false;
        JTextField interviewrName, platform, workingHours, salary, developerName, contractPeriod, joiningDate, advanceSalary, staffRoomNo;
        JButton addBtn;
        int fWidth = 600, fHeight = 450;
        final JFrame frame = new JFrame("Senior Developer Appointment System");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fWidth, fHeight);

        //Adding First UI
        {//First Label with Text Field
            JLabel label = new JLabel("Interviewer Name: ");
            label.setBounds(10, 10, 120, 30);
            frame.add(label);

            interviewrName = new JTextField();
            interviewrName.setBounds(130,10,445,30);
            frame.add(interviewrName);
        }
        {//Second Label with Text Field
            JLabel label = new JLabel("Platform: ");
            label.setBounds(10, 45, 120, 30);
            frame.add(label);

            platform = new JTextField();
            platform.setBounds(130,45,445,30);
            frame.add(platform);
        }
        {//Third Label with Text Field
            JLabel label = new JLabel("Working Hours: ");
            label.setBounds(10, 80, 120, 30);
            frame.add(label);

            workingHours = new JTextField();
            workingHours.setBounds(130,80,445,30);
            frame.add(workingHours);
        }
        {//Forth Label with Text Field
            JLabel label = new JLabel("Salary: ");
            label.setBounds(10, 115, 120, 30);
            frame.add(label);

            salary = new JTextField();
            salary.setBounds(130,115,445,30);
            frame.add(salary);
        }

        //Adding Panel UI For UI Line
        {
            JPanel panel = new JPanel();
            panel.setBounds(10, 190, 565, 2);
            panel.setBackground(Color.GRAY);
            frame.add(panel);
        }

        //Adding Second UI
        {//First Label with Text Field
            JLabel label = new JLabel("Developer Name: ");
            label.setBounds(10, 200, 120, 30);
            frame.add(label);

            developerName = new JTextField();
            developerName.setBounds(130,200,445,30);
            frame.add(developerName);
        }

        {//second Label with Text Field
            JLabel label = new JLabel("Joining Date: ");
            label.setBounds(10, 235, 120, 30);
            frame.add(label);

            joiningDate = new JTextField();
            joiningDate.setBounds(130,235,445,30);
            frame.add(joiningDate);
        }
        {//third Label with Text Field
            JLabel label = new JLabel("Contract Period: ");
            label.setBounds(10, 270, 120, 30);
            frame.add(label);

            contractPeriod = new JTextField();
            contractPeriod.setBounds(130,270,445,30);
            frame.add(contractPeriod);
        }
        {//fourth Label with Text Field
            JLabel label = new JLabel("Advance Salary: ");
            label.setBounds(10, 305, 120, 30);
            frame.add(label);

            advanceSalary = new JTextField();
            advanceSalary.setBounds(130,305,445,30);
            frame.add(advanceSalary);
        }
        {//fifth Label with Text Field
            JLabel label = new JLabel("Staff Room No.: ");
            label.setBounds(10, 340, 120, 30);
            frame.add(label);

            staffRoomNo = new JTextField();
            staffRoomNo.setBounds(130,340,445,30);
            frame.add(staffRoomNo);
        }

        //Buttons UI
        {//Add Button
            addBtn= new JButton("ADD");
            addBtn.setBounds(475, 150, 100, 30);
            addBtn.addActionListener(e ->  {
                //add... something..
                try {
                    if(platform.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Platform Field.");
                        return;
                    }
                    else if(interviewrName.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Interview Field.");
                        return;
                    }
                    else if(workingHours.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Working Field.");
                        return;
                    }
                    else if(salary.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Salary Field.");
                        return;
                    }

                    SeniorDeveloper seniorDeveloper = new SeniorDeveloper(platform.getText(), interviewrName.getText(), Integer.parseInt(workingHours.getText()), Double.valueOf(salary.getText()), 0);
                    developerArrayList.add(seniorDeveloper);
                    //currentSeniorDeveloper = seniorDeveloper;
                    addBtn.setEnabled(false);
                    Msg(frame, "Info","Platform Added");
                }
                catch (Exception ex){
                    Msg(frame, "Error", ex.toString());
                }
            });
            frame.add(addBtn);
        }
        {//Back Button
            JButton btn = new JButton("Back");
            btn.setBounds(475, 380, 100, 30);
            btn.addActionListener(e ->  {
                //Go Back
                openAppointmentWindow();
                frame.dispose();
            });
            frame.add(btn);
        }
        {//Clear Button
            JButton btn = new JButton("Clear");
            btn.setBounds(370, 380, 100, 30);
            btn.addActionListener(e ->  {
                //Clear All Field
                interviewrName.setText("");
                platform.setText("");
                workingHours.setText("");
                salary.setText("");
                developerName.setText("");
                contractPeriod.setText("");
                joiningDate.setText("");
                advanceSalary.setText("");
                staffRoomNo.setText("");
                addBtn.setEnabled(true);
                isadd=false;

            });
            frame.add(btn);
        }
        {//Appoint Button
            JButton btn = new JButton("Appoint");
            btn.setBounds(265, 380, 100, 30);
            btn.addActionListener(e ->  {
                //add... something..
                try {
                    SeniorDeveloper currentSeniorDeveloper = (SeniorDeveloper) developerArrayList.get(developerArrayList.size() - 1);
                    if (currentSeniorDeveloper != null) {
                        currentSeniorDeveloper.hireDeveloper(developerName.getText(), joiningDate.getText(), Double.valueOf(advanceSalary.getText()), staffRoomNo.getText());
                        Msg(frame, "Info", "New Developer Appointed!");

                        //Clear All Field
                        interviewrName.setText("");
                        platform.setText("");
                        workingHours.setText("");
                        salary.setText("");
                        developerName.setText("");
                        contractPeriod.setText("");
                        joiningDate.setText("");
                        advanceSalary.setText("");
                        staffRoomNo.setText("");
                        addBtn.setEnabled(true);
                        isadd=false;
                    } else {
                        Msg(frame, "Error", "Fill Senior Developer Platform field.");
                    }
                }
                catch (Exception ex){
                    Msg(frame, "Error", ex.getMessage());
                }
            });
            frame.add(btn);
        }
        {//Display Button
            JButton btn = new JButton("Display");
            btn.setBounds(160, 380, 100, 30);
            btn.addActionListener(e ->  {
                //do something
                openDisplayWindow(1, "Display Senior Developer Lists");
            });
            frame.add(btn);
        }
        frame.setVisible(true);
    }

    private void openJuniorWindow(){
        isadd =false;
        JTextField interviewrName, platform, workingHours, salary, developerName, terminationDate, appointedDate, specialization, evaluationPeriod, appointedBy;
        JButton addBtn;

        int fWidth = 600, fHeight = 480;
        final JFrame frame = new JFrame("Junior Developer Appointment System");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fWidth, fHeight);

        //Adding First UI
        {//First Label with Text Field
            JLabel label = new JLabel("Interviewer Name: ");
            label.setBounds(10, 10, 120, 30);
            frame.add(label);

            interviewrName = new JTextField();
            interviewrName.setBounds(130,10,445,30);
            frame.add(interviewrName);
        }
        {//Second Label with Text Field
            JLabel label = new JLabel("Platform: ");
            label.setBounds(10, 45, 120, 30);
            frame.add(label);

            platform = new JTextField();
            platform.setBounds(130,45,445,30);
            frame.add(platform);
        }
        {//Third Label with Text Field
            JLabel label = new JLabel("Working Hours: ");
            label.setBounds(10, 80, 120, 30);
            frame.add(label);

            workingHours = new JTextField();
            workingHours.setBounds(130,80,445,30);
            frame.add(workingHours);
        }
        {//Forth Label with Text Field
            JLabel label = new JLabel("Salary: ");
            label.setBounds(10, 115, 120, 30);
            frame.add(label);

            salary = new JTextField();
            salary.setBounds(130,115,445,30);
            frame.add(salary);
        }



        //Adding Panel UI For UI Line
        {
            JPanel panel = new JPanel();
            panel.setBounds(10, 190, 565, 2);
            panel.setBackground(Color.GRAY);
            frame.add(panel);
        }

        //Adding Second UI
        {//First Label with Text Field
            JLabel label = new JLabel("Developer Name: ");
            label.setBounds(10, 200, 120, 30);
            frame.add(label);

            developerName = new JTextField();
            developerName.setBounds(130,200,445,30);
            frame.add(developerName);
        }

        {//Second Label with Text Field
            JLabel label = new JLabel("Appointed Date: ");
            label.setBounds(10, 235, 120, 30);
            frame.add(label);

            appointedDate = new JTextField();
            appointedDate.setBounds(130,235,445,30);
            frame.add(appointedDate);
        }
        {//third Label with Text Field
            JLabel label = new JLabel("Termination Date: ");
            label.setBounds(10, 270, 120, 30);
            frame.add(label);

            terminationDate = new JTextField();
            terminationDate.setBounds(130,270,445,30);
            frame.add(terminationDate);
        }
        {//Fourth Label with Text Field
            JLabel label = new JLabel("Specialization: ");
            label.setBounds(10, 305, 120, 30);
            frame.add(label);

            specialization = new JTextField();
            specialization.setBounds(130,305,445,30);
            frame.add(specialization);
        }
        {//fifth Label with Text Field
            JLabel label = new JLabel("Evaluation Period: ");
            label.setBounds(10, 340, 120, 30);
            frame.add(label);

            evaluationPeriod = new JTextField();
            evaluationPeriod.setBounds(130,340,445,30);
            frame.add(evaluationPeriod);
        }
        {//Sixth Label with Text Field
            JLabel label = new JLabel("Appointed By: ");
            label.setBounds(10, 375, 120, 30);
            frame.add(label);

            appointedBy = new JTextField();
            appointedBy.setBounds(130,375,445,30);
            frame.add(appointedBy);
        }

        //Buttons UI
        {//Back Button
            JButton btn = new JButton("Back");
            btn.setBounds(475, 410, 100, 30);
            btn.addActionListener(e ->  {
                //Go Back
                openAppointmentWindow();
                frame.dispose();
            });
            frame.add(btn);
        }

        {//Add Button
            addBtn = new JButton("ADD");
            addBtn.setBounds(475, 150, 100, 30);
            addBtn.addActionListener(e ->  {
                //add... junior developer..
                try {
                    if(platform.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Platform Field.");
                        return;
                    }
                    else if(interviewrName.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Interview Field.");
                        return;
                    }
                    else if(workingHours.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Working Field.");
                        return;
                    }
                    else if(salary.getText().equals("")){
                        Msg(frame, "Error", "Enter Value in Salary Field.");
                        return;
                    }

                    JuniorDeveloper juniorDeveloper = new JuniorDeveloper(platform.getText(), interviewrName.getText(), Integer.parseInt(workingHours.getText()), Double.valueOf(salary.getText()),appointedBy.getText(),terminationDate.getText());
                    developerArrayList.add(juniorDeveloper);

                    addBtn.setEnabled(false);
                    isadd=true;
                    Msg(frame, "Info","Platform Added");
                }
                catch (Exception ex){
                    Msg(frame, "Error", ex.toString());
                }
            });
            frame.add(addBtn);
        }
        {//Clear Button
            JButton btn = new JButton("Clear");
            btn.setBounds(370, 410, 100, 30);
            btn.addActionListener(e ->  {
                //Clear All Field
                interviewrName.setText("");
                platform.setText("");
                workingHours.setText("");
                salary.setText("");
                developerName.setText("");
                appointedDate.setText("");
                terminationDate.setText("");
                specialization.setText("");
                evaluationPeriod.setText("");
                appointedBy.setText("");
                addBtn.setEnabled(true);
                isadd = false;
            });
            frame.add(btn);
        }
        {//Appoint Button
            JButton btn = new JButton("Appoint");
            btn.setBounds(265, 410, 100, 30);
            btn.addActionListener(e ->  {
                //adds Junior developer..
                try {
                    if(!isadd) {return;}

                    JuniorDeveloper currentJuniorDeveloper = (JuniorDeveloper) developerArrayList.get(developerArrayList.size() - 1);
                    if (currentJuniorDeveloper != null) {
                        currentJuniorDeveloper.appointDeveloper(developerName.getText(), appointedDate.getText(), terminationDate.getText(), specialization.getText());
                        Msg(frame, "Info", "New Developer Appointed!");

                        //Clear All Field
                        interviewrName.setText("");
                        platform.setText("");
                        workingHours.setText("");
                        salary.setText("");
                        developerName.setText("");
                        appointedDate.setText("");
                        terminationDate.setText("");
                        specialization.setText("");
                        appointedBy.setText("");
                        evaluationPeriod.setText("");
                        addBtn.setEnabled(true);
                        isadd = false;
                    } else {
                        Msg(frame, "Error", "Fill Senior Developer Platform field.");
                    }
                }
                catch (Exception ex){
                    Msg(frame, "Error", ex.getMessage());
                }
            });
            frame.add(btn);
        }
        {//Display Button
            JButton btn = new JButton("Display");
            btn.setBounds(160, 410, 100, 30);
            btn.addActionListener(e ->  {
                //do something
                openDisplayWindow(0, "Junior Developer Lists");
            });
            frame.add(btn);
        }
        frame.setVisible(true);
    }

    private void openDisplayWindow(int type, String title){
        //type =1 =>senior, type = 0=> junior
        int fWidth = 850, fHeight = 400;
        final JFrame frame = new JFrame(title);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setSize(fWidth, fHeight);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(0,0,fWidth,fHeight);
        if(type == 1){
            //if type = 1 it displays senior developer list
            int i=0;
            for(Developer developer : developerArrayList){
                try {
                    SeniorDeveloper seniorDeveloper = (SeniorDeveloper) developer;
                    textArea.append("S.N No: " + i+ " Developer Name: " + developer.getDeveloperName() + " Platform: " + developer.getPlatform() + " Join Date: " + seniorDeveloper.getJoiningDate() + " Salary: "+ ((SeniorDeveloper) developer).getSalary()+ " Termination Status: " + seniorDeveloper.getTerminated()+ "\n");
                }
                catch(Exception ex) {
                    //---do nothing..
                }
                i++;
            }
        }
        else {
            //if type is not equql to 1 it shows junior developer 
            for(Developer developer : developerArrayList){
                try {
                    JuniorDeveloper juniorDeveloper = (JuniorDeveloper) developer;
                    textArea.append("Developer Name: " + developer.getDeveloperName() + " Platform: " + developer.getPlatform() + " Appointed Date: " + juniorDeveloper.getAppointedDate() + "\n");
                }
                catch(Exception ex) {
                    //---do nothing..
                }
            }
        }
        frame.add(textArea);
        frame.setVisible(true);
    }

    private void Msg(JFrame frame, String title, String message){
        //displays messages
        JDialog dialog = new JDialog(frame, title);
        dialog.setLocationRelativeTo(null);
        JLabel label = new JLabel(message);
        label.setBounds(10,10,200,100);
        dialog.setSize(200, 100);
        dialog.add(label);
        dialog.setVisible(true);

    }

    public static void main(String[] args){
        //mainfunction to run program
        new RigoTechnology();
    }
}


