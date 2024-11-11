package com.nb.my_app.mapper;

import com.nb.my_app.entity.ImageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageInfoMapper {

    //插入图片信息
    void insertImageInfo(ImageInfo imageInfo);

    //根据ID查询图片
    List<ImageInfo> selectImageInfoById(int imageId);

    //更新图片信息
    void updateImageInfo();

    //删除图片信息
    void deleteImageInfo();

    //查询所有图片信息
    List<ImageInfo> selectAllImageInfo();
}
