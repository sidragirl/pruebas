package com.car.mundo.usuario.procedure;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

import com.car.mundo.usuario.dto.LoginDto;

import oracle.jdbc.OracleTypes;

@Component
public class LoginProcedure extends StoredProcedure {
	
	public LoginProcedure(DataSource ds) {
        super(ds,"PA_GESTION_USUARIOS.FN_LOGIN");
        setFunction(true);
        declareParameter(new SqlOutParameter("RETURN", OracleTypes.INTEGER));
        declareParameter(new SqlParameter("P_USUARIO", OracleTypes.VARCHAR));
        declareParameter(new SqlParameter("P_PASSWORD", OracleTypes.VARCHAR));
        declareParameter(new SqlOutParameter("P_CERROR", OracleTypes.INTEGER));
        declareParameter(new SqlOutParameter("P_MERROR", OracleTypes.VARCHAR));
        compile();
    }

    public Integer execute(LoginDto dto) {
        Map<String, Object> params = new HashMap<>();
        params.put("P_USUARIO", dto.getUsuario());
        params.put("P_PASSWORD", dto.getPassword());
        Map<String, Object> rs = super.execute(params);
        return (Integer) rs.get("RETURN");
    }

}
