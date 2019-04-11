package com.car.mundo.personaje.procedure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

import com.car.mundo.personaje.domain.Personaje;
import com.car.mundo.personaje.procedure.rowmapper.PersonajeSeleccionRowMapper;
import oracle.jdbc.OracleTypes;

@Component
public class ListarPersonajesUsuarioProcedure extends StoredProcedure {
	
	public ListarPersonajesUsuarioProcedure(DataSource ds) {
        super(ds,"PA_GESTION_PERSONAJES.FN_LISTAR_PERSONAJES_USUARIO");
        setFunction(true);
        declareParameter(new SqlOutParameter("RETURN", OracleTypes.INTEGER));
        declareParameter(new SqlParameter("P_USUARIO", OracleTypes.VARCHAR));
        declareParameter(new SqlOutParameter("P_LISTA_PJ", OracleTypes.CURSOR, new PersonajeSeleccionRowMapper()));
        declareParameter(new SqlOutParameter("P_CERROR", OracleTypes.INTEGER));
        declareParameter(new SqlOutParameter("P_MERROR", OracleTypes.VARCHAR));
        compile();
    }

    @SuppressWarnings("unchecked")
	public List<Personaje> execute(String usuario) {
        Map<String, Object> params = new HashMap<>();
        params.put("P_USUARIO", usuario);
        Map<String, Object> rs = super.execute(params);
        return (List<Personaje>) rs.get("P_LISTA_PJ");
    }

}
