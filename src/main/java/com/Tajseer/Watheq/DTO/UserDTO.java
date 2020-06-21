package com.Tajseer.Watheq.DTO;


    public class UserDTO {

        private String UserFirstName, UserLastName;
        private String DOB;
        private int MobileNumber;
        private String Email;

        public UserDTO(String userFirstName, String userLastName, String DOB, int mobileNumber, String email) {
            UserFirstName = userFirstName;
            UserLastName = userLastName;
            this.DOB = DOB;
            MobileNumber = mobileNumber;
            Email = email;
        }
        public UserDTO(){}

        public String getUserFirstName() {
            return UserFirstName;
        }

        public void setUserFirstName(String userFirstName) {
            UserFirstName = userFirstName;
        }

        public String getUserLastName() {
            return UserLastName;
        }

        public void setUserLastName(String userLastName) {
            UserLastName = userLastName;
        }

        public String getDOB() {
            return DOB;
        }

        public void setDOB(String DOB) {
            this.DOB = DOB;
        }

        public int getMobileNumber() {
            return MobileNumber;
        }

        public void setMobileNumber(int mobileNumber) {
            MobileNumber = mobileNumber;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }
    }