package com.example.lab_work_smd_section_bscs_6c.Task04RecyclerView;

public class Task04WhatsappData {
    String UserName;
    String UserMessage;
    int UserPicture;

    public Task04WhatsappData() {
    }

    public Task04WhatsappData(String userName, String userMessage, int userPicture) {
        UserName = userName;
        UserMessage = userMessage;
        UserPicture = userPicture;
    }

    public String getName() {
        return UserName;
    }

    public String getMessage() {
        return UserMessage;
    }

    public int getPicture() {
        return UserPicture;
    }
}
