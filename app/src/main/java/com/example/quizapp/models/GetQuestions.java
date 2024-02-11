package com.example.quizapp.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetQuestions {

    private final List<Question> allQuestions;

    public GetQuestions() {
        allQuestions = new ArrayList<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
        allQuestions.add(new Question("Which is the biggest continent in the world?",
                new String[]{"North America", "Asia", "Africa", "Australia"}, 1));

        allQuestions.add(new Question("Which is the longest river in the world?",
                new String[]{"Great Ganga", "Nile", "Amazon", "Niger"}, 1));

        allQuestions.add(new Question("Which is the largest ocean in the world?",
                new String[]{"Indian Ocean", "Pacific Ocean", "Arctic Ocean", "Atlantic Ocean"}, 1));

        allQuestions.add(new Question("Which is India’s first supercomputer?",
                new String[]{"Param8000", "param80000", "param800", "param8"}, 0));

        allQuestions.add(new Question("Which bank is called the Bankers Bank of India?",
                new String[]{"Reserve Bank of India", "Punjab National Bank", "State Bank of India", "ICICI Bank"}, 0));

        allQuestions.add(new Question("Which is the largest animal in the world?",
                new String[]{"Shark", "Blue whale", "Elephant", "Giraffe"}, 1));

        allQuestions.add(new Question("Which is the largest animal on land?",
                new String[]{"Tiger", "White Elephant", "African Elephant", "Crocodile"}, 2));

        allQuestions.add(new Question("Which is the largest island in the world?",
                new String[]{"New Guinea", "Andaman Nicobar", "Greenland", "Hawaii"}, 2));

        allQuestions.add(new Question("Which is the largest flower in the world?",
                new String[]{"Rafflesia", "Jasmine", "Balloon Flower", "Camellia"}, 0));

        allQuestions.add(new Question("Which is the 29th state of India?",
                new String[]{"Uttarakhand", "Telangana", "Uttar Pradesh", "Madhya Pradesh"}, 1));

        allQuestions.add(new Question("Who was India’s first Deputy Prime Minister?",
                new String[]{"Morarji Desai", "Vallabhbhai Patel", "Devi Lal", "Charan Singh"}, 1));

        allQuestions.add(new Question("Which is the hottest continent on Earth?",
                new String[]{"Africa", "South Asia", "North America", "Australia"}, 0));

        allQuestions.add(new Question("How many letters are there in the English alphabet?",
                new String[]{"20", "26", "24", "21"}, 1));

        allQuestions.add(new Question("Which animal is the fastest land animal in the world?",
                new String[]{"Cheetah", "Springbok", "Lion", "House Centipede"}, 0));

        allQuestions.add(new Question("Which is the highest dam of India?",
                new String[]{"Rihand Dam", "Tehri Dam", "Mettur Dam", "Sardar Sarovar Dam"}, 1));

        allQuestions.add(new Question("Which is the largest freshwater lake in the world?",
                new String[]{"Great Bear Lake", "Lake Superior", "Ohrid Lake", "Great Salt Lake"}, 0));

        allQuestions.add(new Question("How many days are there in August?",
                new String[]{"30", "31", "28", "29"}, 1));

        allQuestions.add(new Question("What is the 19th letter of the English alphabet?",
                new String[]{"N", "M", "W", "S"}, 0));

        allQuestions.add(new Question("Who was India’s first President?",
                new String[]{"Dr. Rajendra Prasad", "Sarvepalli Radhakrishnan", "Varahagiri Venkata Giri", "Varahagiri Venkata Giri"}, 0));

        allQuestions.add(new Question("Which Indian state has a separate constitution?",
                new String[]{"Jammu and Kashmir", "West Bengal", "Haryana", "Goa"}, 0));

        allQuestions.add(new Question("Who is the first prime minister of India?",
                new String[]{"Narendra Modi", "Jawaharlal Nehru", "Motilal Nehru", "Indra Gandhi"}, 1));

        allQuestions.add(new Question("Panama Canal linked which two oceans?",
                new String[]{"Atlantic and Pacific", "Atlantic and Indian", "Arctic and Pacific", "Indian and Pacific"}, 0));

        allQuestions.add(new Question("Which is the smallest continent in the world?",
                new String[]{"Asia", "Australia", "Arctic", "Africa"}, 1));

        allQuestions.add(new Question("Who was the inventor of electricity?",
                new String[]{"Benjamin", "Benjamin Franklin", "Leonardo da Vinci", "Vikings"}, 1));

        allQuestions.add(new Question("Which metal is the lightest metal in the world?",
                new String[]{"Zinc", "Lithium", "Platinum", "Gold"}, 1));

        allQuestions.add(new Question("LED stands for what?",
                new String[]{"Light Emitting Device", "Low Emitting Diode", "Light Electronic Diode", "Light Emitting Diode"}, 3));

        allQuestions.add(new Question("How many colors are there in a rainbow?",
                new String[]{"10", "9", "7", "11"}, 2));

        allQuestions.add(new Question("We smell with which part of our body?",
                new String[]{"Ear", "Mouth", "Brain", "Nose"}, 3));

        allQuestions.add(new Question("‘Taj Mahal’ is located at which place?",
                new String[]{"Dehradun", "Agra", "Ranchi", "Mumbai"}, 1));

        allQuestions.add(new Question("Computer is connected to the Internet by which device?",
                new String[]{"Modem", "Mouse", "CPU", "RAM"}, 0));

        allQuestions.add(new Question("Which is the smallest planet in our solar system?",
                new String[]{"The Earth", "Mars", "Mercury", "Saturn"}, 2));

        allQuestions.add(new Question("What is the Sun?",
                new String[]{"Planet", "Comet", "Pulsar", "Star"}, 3));

        allQuestions.add(new Question("The Moon is the natural satellite of which planet?",
                new String[]{"The Earth", "Mercury", "Venus", "Pluto"}, 0));

        allQuestions.add(new Question("How many players are there in an ice hockey team?",
                new String[]{"5", "7", "8", "6"}, 1));

        allQuestions.add(new Question("How many players are there in a Cricket team?",
                new String[]{"10", "9", "6", "11"}, 3));

        allQuestions.add(new Question("General Election in India is held after how many years?",
                new String[]{"2", "10", "6", "5"}, 1));

        allQuestions.add(new Question("What is the capital of the United States of America?",
                new String[]{"New York", "Washington, D.C.", "Los Angeles", "Philadelphia"}, 1));

        allQuestions.add(new Question("What is the capital of the United Kingdom?",
                new String[]{"London", "Liverpool", "Bristol", "Edinburgh"}, 0));

        allQuestions.add(new Question("How many meters are in 1 Kilometer?",
                new String[]{"500", "2000", "100", "1000"}, 3));

        allQuestions.add(new Question("What is the capital of Karnataka?",
                new String[]{"Bengaluru", "Mysore", "Belgaum", "Hubli"}, 0));

        allQuestions.add(new Question("World War ll (WW2) was ended in which year?",
                new String[]{"1965", "1955", "1945", "1950"}, 2));

        allQuestions.add(new Question("World War l (WW1) was ended in which year?",
                new String[]{"1917", "1920", "1919", "1918"}, 3));

        allQuestions.add(new Question("In which year did India celebrate its first Republic day?",
                new String[]{"1949", "1950", "1951", "1952"}, 1));

        allQuestions.add(new Question("Pakistan got independent in which year?",
                new String[]{"1947", "1948", "1949", "1950"}, 0));
    }

    public List<Question> getRandomQuestions() {
        List<Question> selectedQuestions = new ArrayList<>(allQuestions);

        Collections.shuffle(selectedQuestions);

        int numQuestionsToSelect = 10;
        return selectedQuestions.subList(0, numQuestionsToSelect);
    }



}
