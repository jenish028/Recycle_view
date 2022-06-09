package com.example.recycle_view.controller;



    public class ModalData {
        String city, code;
        int cityimage;

        public ModalData(String city, String code, int cityimage) {
            this.city = city;
            this.code = code;
            this.cityimage = cityimage;
        }

        public int getCityimage() {
            return cityimage;
        }

        public void setCityimage(int cityimage) {
            this.cityimage = cityimage;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {

            this.code = code;
        }
    }