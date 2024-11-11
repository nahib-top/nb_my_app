package com.nb.my_app.service.impl;

import com.nb.my_app.entity.ImageInfo;
import com.nb.my_app.mapper.ImageInfoMapper;
import com.nb.my_app.service.ImageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageInfoServiceImpl implements ImageInfoService {

    private final ImageInfoMapper imageInfoMapper;

    @Autowired
    public ImageInfoServiceImpl(ImageInfoMapper imageInfoMapper){
        this.imageInfoMapper = imageInfoMapper;
    }
    @Override
    public void setImageInfo(ImageInfo imageInfo) {
        imageInfoMapper.insertImageInfo(imageInfo);
    }
}
