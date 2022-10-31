/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.data.fatika;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Fatika
 */
@Controller
public class WebController {
    @RequestMapping ("/masuk")
    public String getLogin (@RequestParam(value="mNama") String nama,
                            @RequestParam(value="mTanggal") String date,
                            @RequestParam(value="mFile") MultipartFile file,
                            Model model)
    throws IOException{
        byte[] img = file.getBytes();
        String base64Image = Base64.encodeBase64String(img);
        String imglink ="data:image/png;base64,".concat(base64Image);
        model.addAttribute("OutputNama", nama);
        model.addAttribute("OutputTanggal", date);
        model.addAttribute("OutputFile", imglink);
        return "dataview";
    }   
}
