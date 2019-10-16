package com.auction.daos;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.auction.entities.ProductImage;
/**
 * @author Mansi Hiremath
 * @creation_date 13 October,2019 7:38 PM
 * @modification_date 13 October,2019 7:38 PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a DAO class
 *
 */
@Repository
public class ProductImageDaoImpl implements ProductImageDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	private ProductImage productImage;
	private static String fileLocation = "E://uploadedfiles//";	
@RequestMapping(value="/upload")
	public String insertImage(@RequestParam("file") MultipartFile[] files) 
 {
		// TODO Auto-generated method stub
	

    String status = "";
    File dir = new File(fileLocation);
    for (int i = 0; i < files.length; i++) {
        MultipartFile file = files[i];
               try {
            byte[] bytes = file.getBytes();

            if (!dir.exists())
                dir.mkdirs();

            File uploadFile = new File(dir.getAbsolutePath()
                    + File.separator + file.getOriginalFilename());
            BufferedOutputStream outputStream = new BufferedOutputStream(
                    new FileOutputStream(uploadFile));
            outputStream.write(bytes);
            outputStream.close();
            status = status + "You successfully uploaded file=" + file.getOriginalFilename();
            
            productImage.setImageLocation(fileLocation+file.getOriginalFilename());
            return (String) hibernateTemplate.save(productImage);
        } catch (Exception e) {
            status = status + "Failed to upload " + file.getOriginalFilename()+ " " + e.getMessage();
        }
    }
    return status;
}
	

	public void deleteImage(ProductImage productImage) {
		// TODO Auto-generated method stub
		
	}

	public List<ProductImage> getImageLocation() {
		// TODO Auto-generated method stub
		return null;
	}


	

	
	
	

	
}
