# Help Activity Demo 

helpactivitydemo-melvincabatuan created by Classroom for GitHub

This assignment presents a basic Help activity implementation using text from a raw file.


## Problem:

Design and implement an Android Help activity utilizing a text file in the raw directory.   


## Accept

To accept the assignment, click the following URL:

https://classroom.github.com/assignment-invitations/54ff8695a1e03bab82886c6484ac3bb1

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/helpactivitydemo-melvincabatuan

## Keypoints:

File access:
```Java
 // Read raw file into string and populate TextView
        InputStream iFile = getResources().openRawResource(R.raw.help);
        try {
            TextView helpText = (TextView) findViewById(R.id.TextView_HelpText);
            String strFile = inputStreamToString(iFile);
            helpText.setText(strFile);
        } catch (Exception e) {
            // Handle Exception, i.e. toast cannot open file
        }
```

Extract the String:
```Java
  public String inputStreamToString(InputStream is) throws IOException {
        StringBuffer sBuffer = new StringBuffer();
        DataInputStream dataIO = new DataInputStream(is);
        String strLine = null;

        while ((strLine = dataIO.readLine()) != null) {
            sBuffer.append(strLine + "\n");
        }

        dataIO.close();
        is.close();

        return sBuffer.toString();
    }
```

Sample help.txt in the raw directory:
```text
HELP DEMO v1.0 (Alpha)


HELP DEMO v1.0 /* Give a background of the app */


INSTRUCTIONS:

/* Give the instructions for the app */


FEATURES:
- ...
/* Give the features of the app */ 


SUPPORT INFORMATION:

/* APP NAME */ is developed by MKC.

Melvin K. Cabatuan
Phone: (+63)999-522-6213
Email: melvincabatuan@gmail.com
All Rights Reserved
```



## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```

Sample:

 https://gist.github.com/melvincabatuan/c0cf1e8a80466b30d8d1


## Screenshots:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/helpactivitydemo-melvincabatuan/blob/master/device-2015-10-05-231834.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/helpactivitydemo-melvincabatuan/blob/master/device-2015-10-05-231911.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/helpactivitydemo-melvincabatuan/blob/master/device-2015-10-05-231943.png)

"*Your time is limited, so don’t waste it living someone else’s life.*" - Steve Jobs
