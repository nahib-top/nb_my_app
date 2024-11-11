package com.nb.my_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageInfo {

    /**
     * 图片的唯一标识符。
     */
    private Integer imageId;

    /**
     * 图片的名称。
     */
    private String imageName;

    /**
     * 图片的存储路径。
     */
    private String imagePath;
}
