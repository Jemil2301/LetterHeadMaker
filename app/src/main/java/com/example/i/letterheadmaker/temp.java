package com.example.i.letterheadmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class temp extends AppCompatActivity {
  //  String da;
    TextView BP,BI,AL,CO,TY,LH;
    String D;

    String content[]= {"[DATE OF EXECUTION]\n" +
            "\n" +
            "[NAME OF RECIPIENT AUTHORIZED REPRESENTATIVE]\n" +
            "[JOB DESIGNATION]\n" +
            "[COMPANY NAME]\n" +
            "[ADDRESS]\n" +
            "\n" +
            "Dear Mr./Ms. ____________,\n" +
            "\n" +
            "A pleasant day to you. On behalf of our company,\n" +
            "\n" +
            "[COMPANY NAME]\n" +
            "\n" +
            ", I would like to emphasize how happy we are that you intend to avail of our services and that you have chosen our company to present and propose to you our services [PROVIDE TYPE OF SERVICES].\n" +
            " \n" +
            "The company is primarily engaged in providing high-quality and efficient [SERVICE TYPE] services. Our company is considered one of the biggest in the industry. After due consideration of your company’s current needs and plans, we have come up with a comprehensive proposal and plan which will best serve your interests. The terms of this proposal are perfectly tailored to fit your business context and needs. Rest assured that we will charge you with flexible and reasonable rates.\n" +
            "\n" +
            "In line with the foregoing relevant points, this proposal shall showcase how the company functions as a business, the various services that it offers to its clients, the proposed execution and implementation plan, the schedule of fees, the payment terms and conditions, and etc.\n" +
            "\n" +
            "If you have inquiries or concerns about the terms that we are offering, you can contact me with this number [CONTACT NUMBER] or email me at [EMAIL ADDRESS]. We also want to hear more about your suggestions and recommendations. We’re hoping for your positive response.\n" +
            "\n" +
            "With thanks,\n" +
            "\n" +
            " \n" +
            "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
            "\n" +
            "[JOB DESIGNATION]\n" +
            "\n" +
            "[COMPANY NAME]\n" +
            "\n" +
            "[ADDRESS]",

            //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

            "Date:____\n" +
                    "\n" +
                    "From,\n" +
                    "\n" +
                    "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
                    "[JOB DESIGNATION]\n" +
                    "[COMPANY NAME]\n" +
                    "[ADDRESS]\n" +
                    "[PHONE]\n" +
                    "\n" +
                    "To,\n" +
                    "[Name of Recipient]\n" +
                    "[Designation]\n" +
                    "[Name of Company]\n" +
                    "[Address]\n" +
                    " \n" +
                    "Subject: Business Inquiry\n" +
                    "\n" +
                    "Dear Mr./Ms. [Name of Recipient],\n" +
                    "\n" +
                    "I am writing this letter to congratulate you on your new business venture. I believe that you can achieve towering levels of success, having discovered your niche in the local market.\n" +
                    "\n" +
                    "A substantial amount of my clients are now looking for products that are made with eco-friendly materials. As you can see, more and more people are now gaining interest in maintaining a cleaner and greener environment. It is for this reason that I would like to inquire about the range of eco-friendly products that you are offering as well as a list of prices.\n" +
                    "\n" +
                    "I hope that a good working relationship develops between us in the future. Also, I would very much appreciate it if a representative from your company will pay us a visit to further discuss this amazing business venture. Please let me know when it will be possible for such a visit to take place. I will make sure that our highly trained staff will give you a warm welcome and a quick tour of our premises.\n" +
                    "\n" +
                    "Looking forward to your prompt response.\n" +
                    "\n" +
                    "Thank you very much.\n" +
                    "\n" +
                    "Sincerely,\n" +
                    "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
                    "[JOB DESIGNATION]\n" +
                    "[COMPANY NAME]",

            //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


            "Date\n" +
                    "\n" +
                    "[NAME OF RECIPIENT]\n" +
                    "[JOB DESIGNATION]\n" +
                    "[COMPANY NAME]\n" +
                    "[ADDRESS]\n" +
                    "[PHONE]\n" +
                    "[EMAIL]\n" +
                    "\n" +
                    "Dear [NAME OF RECIPIENT];\n" +
                    "\n" +
                    "I am pleased to appoint you as the new [job title] at [name of business or company] beginning [start date].\n" +
                    "\n" +
                    "The document attached outlines the company’s proposed terms and conditions regarding your appointment. If  there is anything listed in this offer that you are not clear about, disagree with, do not fully understand, or want to discuss, please feel free to contact me via phone [CONTACT NUMBER] or email me at [EMAIL ADDRESS] so that we can discuss the matter properly.\n" +
                    "\n" +
                    "Should the proposed terms and conditions be acceptable to you, and are therefore willing to take this appointment, please sign the copies of this letter, as well as the appointment agreement. Please return all the necessary documents to the Human Resources Department by [insert date]. If we don’t get a response by the end of office hours on the set date, the offer will automatically be withdrawn.\n" +
                    "\n" +
                    "Welcome to the team, the company is looking forward to working with you.\n" +
                    "\n" +
                    "Sincerely\n" +
                    "\n" +
                    "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
                    "\n" +
                    "[JOB DESIGNATION]\n" +
                    "\n" +
                    "[COMPANY NAME]\n" +
                    "\n" +
                    "*\n" +
                    "\n" +
                    "I, [NAME OF RECIPIENT], have read and reviewed the terms and conditions of my appointment as set forth by my employer through this letter. I have herein attached the signed agreement. By doing so, I agree to accept this offer, and I fully understand the circumstances stated in this agreement as well as the terms and conditions set forth by the employer.\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "Signed by: (Name and Signature)                                                                             Date:",

            //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

            "[Date]\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "[NAME OF RECIPIENT AUTHORIZED REPRESENTATIVE]\n" +
                    "[JOB DESIGNATION]\n" +
                    "[COMPANY NAME]\n" +
                    "[ADDRESS]\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dear Mr. /Ms. /Mrs. [NAME OF RECIPIENT AUTHORIZED REPRESENTATIVE],\n" +
                    "\n" +
                    "It is my pleasure to offer you a training contract as [Position] in the [Name of the Department] Department at the [COMPANY NAME]. The training contract will begin on [Start Date] and will end on [End Date] which is for a period of __ months and will be working on weekdays from [Start Time] to [End Time].\n" +
                    "\n" +
                    "You will be directly reporting to [Name of the Head of the Department] and shall have the following duties and responsibilities:\n" +
                    "\n" +
                    "[Provide a list of duties and responsibilities of the trainee].\n" +
                    "\n" +
                    "You will be given a monthly salary of [Amount] ($00.00). You will also be given fringe benefits and [Provide other benefits].\n" +
                    "\n" +
                    "We would like to receive your response by [Date]. Should you have any questions on the contract offer, feel free to contact me on [CONTACT NUMBER] or email me at [EMAIL ADDRESS].\n" +
                    "\n" +
                    "We are all looking forward to having you in our company.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Best regards,\n" +
                    "\n" +
                    "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
                    "\n" +
                    "[JOB DESIGNATION]\n" +
                    "\n" +
                    "[COMPANY NAME]",

            //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

            "[DATE]\n" +
                    "\n" +
                    "[NAME OF RECIPIENT AUTHORIZED REPRESENTATIVE]\n" +
                    "[JOB DESIGNATION]\n" +
                    "[COMPANY NAME]\n" +
                    "[ADDRESS]\n" +
                    "[PHONE] [EMAIL]\n" +
                    " \n" +
                    "\n" +
                    "Dear  Mr./Ms. ____________,\n" +
                    "\n" +
                    "\n" +
                    "This letter is written in response to the letter you have sent\n" +
                    "\n" +
                    "[COMPANY NAME]\n" +
                    "\n" +
                    "last [DATE]. The company would like to extend its sincerest thank you and heartfelt gratitude to [RECIPIENT COMPANY NAME] for its board of directors’ [REASON ex. For approving the proposal made, for a company gift it received and etc.].\n" +
                    " \n" +
                    "\n" +
                    "I am truly honored and happy that you choose and invest in our company. All of the staff and employees are truly grateful for what you’ve done. Rest assured that we will suffice all your expectations and to provide you with quality services and works. Again, thank you for trusting our company and I am looking forward to our meeting which will be held this [DATE].  For further queries and other business matters, you can easily raise them to me through this number [CONTACT NUMBER] or email me at [EMAIL ADDRESS].\n" +
                    " \n" +
                    "\n" +
                    "Kind regards,\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "[NAME AND SIGNATURE OF AUTHORIZED REPRESENTATIVE]\n" +
                    "\n" +
                    "[JOB DESIGNATION]\n" +
                    "\n" +
                    "[COMPANY NAME]\n" +
                    "\n" +
                    "[ADDRESS]",

            //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
            " "
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
    //    da=getIntent().getExtras().getString("create");
        BP=(TextView)findViewById(R.id.t1);
        BI=(TextView)findViewById(R.id.t2);
        AL=(TextView)findViewById(R.id.t3);
        CO=(TextView)findViewById(R.id.t4);
        TY=(TextView)findViewById(R.id.t5);
        LH=(TextView)findViewById(R.id.t6);
        D=getIntent().getStringExtra("design");
        BP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[0];
                if(D.equals("d1")){
                Intent i = new Intent(temp.this,Create.class);
                i.putExtra("c1",c1);
                startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });
        BI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[1];
                if(D.equals("d1")){
                    Intent i = new Intent(temp.this,Create.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });
        AL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[2];
                if(D.equals("d1")){
                    Intent i = new Intent(temp.this,Create.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });
        CO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[3];
                if(D.equals("d1")){
                    Intent i = new Intent(temp.this,Create.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });
        TY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[4];
                if(D.equals("d1")){
                    Intent i = new Intent(temp.this,Create.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });
        LH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c1 = content[5];
                if(D.equals("d1")){
                    Intent i = new Intent(temp.this,Create.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d2")){
                    Intent i = new Intent(temp.this,Create1.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d3")){
                    Intent i = new Intent(temp.this,Create2.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else if(D.equals("d4")){
                    Intent i = new Intent(temp.this,Create3.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(temp.this,Create4.class);
                    i.putExtra("c1",c1);
                    startActivity(i);
                }
            }
        });


    }
}
