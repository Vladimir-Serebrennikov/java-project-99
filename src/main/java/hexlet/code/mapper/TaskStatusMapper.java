package hexlet.code.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.MappingTarget;

import hexlet.code.model.TaskStatus;
import hexlet.code.dto.TaskStatusDTO.TaskStatusDTO;
import hexlet.code.dto.TaskStatusDTO.TaskStatusCreateDTO;
import hexlet.code.dto.TaskStatusDTO.TaskStatusUpdateDTO;


@Mapper(
        uses = { JsonNullableMapper.class, ReferenceMapper.class },
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class TaskStatusMapper {
    public abstract TaskStatusDTO map(TaskStatus model);

    public abstract TaskStatus map(TaskStatusCreateDTO data);

    public abstract void update(TaskStatusUpdateDTO dto, @MappingTarget TaskStatus model);
}
