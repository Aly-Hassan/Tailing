package com.ali.trillium;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Readfile {
public void lineRead(String line) throws IOException{
      ValueSet vs = new ValueSet();
      App main =new App();
       int pointer=1;
        File file = new File("src/main/java/com/ali/trillium/Data.json");
         String currentLine=line;

        if (currentLine.length()==67) {
        } else {
            String sign = null;
            String[] seprateSourceDestination = currentLine.split("->");
            String[] sourcePortion = new String[3];
            sourcePortion = seprateSourceDestination[0].split("-");
            String oSResult = sourcePortion[1].replace(" ", "");
              if (oSResult.length()==33) {
                String operatingSystemsResult = oSResult.replace("(", "");
                vs.setSourceOperatingSystem(operatingSystemsResult);
                 sign = sourcePortion[2].replace(")", "").trim();

            } else {
                vs.setSourceOperatingSystem(oSResult);

            }
            if (sign != null && sign.length() > 3) {
                String[] Signature = sign.split(": ");
                vs.setSourceSignature(Signature[1]);
            }
            String[] ipPortion = sourcePortion[0].split(">");
            String datePortion = ipPortion[0].replace("<", "");
            vs.setSourceDate(datePortion);
            String[] portIpPortion = ipPortion[1].split(":");
            String sourceIp = portIpPortion[0].replace(" ", "");
            vs.setSourceIp(sourceIp);
            vs.setSourcePort(portIpPortion[1]);
            String[] desPortIpLink = seprateSourceDestination[1].split(":");
            String desIp = desPortIpLink[0].replace(" ", "");
            vs.setDestinationIp(desIp);
            String[] desport = new String[3];
            desport = desPortIpLink[1].split(" ");
            vs.setDestinationPort(desport[0]);
               if (desport.length > 2 && desport[2] != null) {
                    String desHope = desport[2].replace(",", "");
                    vs.setDestinationHope(desHope);
                  }

            String desLnk = desPortIpLink[2].replace(")", "");
            String desLink = desLnk.replace(" ", "");
            vs.setDestinationLink(desLink);

            Map<String, Object> map = new HashMap<>();
            map.put("date", vs.getSourceDate());
            map.put("sourceIp", vs.getSourceIp());
            map.put("opeatingSystem", vs.getSourceOperatingSystem());
            if (vs.getSourceSignature() != null) {
                map.put("sourceSignature", vs.getSourceSignature());
            }
            map.put("destinationIp", vs.getDestinationIp());
            map.put("destinationPort", vs.getDestinationPort());
            if (vs.getDestinationHope() != null) {

                map.put("hope", vs.getDestinationHope());
            }
            map.put("link", vs.getDestinationLink());
            ObjectMapper mapper = new ObjectMapper();
            String jsonResult = mapper.writeValueAsString(map);
            System.out.println(jsonResult);
            Files.write(new File("src/main/java/com/ali/trillium/Data.json").toPath(), Arrays.asList(jsonResult), StandardOpenOption.APPEND);

            vs.setSourceSignature(null);
            vs.setDestinationHope(null);
        }

}
}



