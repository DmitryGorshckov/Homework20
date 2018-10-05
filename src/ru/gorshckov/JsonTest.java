package ru.gorshckov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

public class JsonTest {

    public static void main(String[] args) throws IOException {


        URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22");
        try (InputStream stream = url.openStream();
             Reader reader = new InputStreamReader(stream);
             BufferedReader bf = new BufferedReader(reader)
        ) {
            String text = null;
            while (bf.ready()) {
                text = bf.readLine();
            }

            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(text,Weather.class);
            System.out.println(weather);

      } catch (IOException e) {
            e.printStackTrace();
        }
        }

    }
