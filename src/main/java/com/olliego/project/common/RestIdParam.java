package com.olliego.project.common;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * 删除请求
 *
 * @author yupi
 */
@Data
public class RestIdParam implements Serializable {
    /**
     * id
     */
    @NotNull(message = "id不能为空" )
    private Long id;

    private static final long serialVersionUID = 1L;
}