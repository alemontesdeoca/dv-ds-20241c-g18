package ar.edu.davinci.dv_ds_20241c_g18.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ar.edu.davinci.dv_ds_20241c_g18.controller.request.PrendaInsertRequest;
import ar.edu.davinci.dv_ds_20241c_g18.controller.request.PrendaUpdateRequest;
import ar.edu.davinci.dv_ds_20241c_g18.controller.response.PrendaResponse;
import ar.edu.davinci.dv_ds_20241c_g18.domain.Prenda;
@Mapper
public interface PrendaMapper {
	PrendaMapper instance = Mappers.getMapper(PrendaMapper.class);
	PrendaResponse mapToPrendaResponse(Prenda prenda);
	Prenda matToPrenda(PrendaInsertRequest prendaDto);
	Prenda matToPrenda(PrendaUpdateRequest prendaDto);
}
