package org.transmart.biomart

import com.recomdata.util.IExcelProfile

class BioAssayAnalysisDataIdx implements IExcelProfile {

	Integer display_idx
	String ext_type
	Integer field_idx
	String field_name

	static transients = ['values']

	static mapping = {
		table name: 'BIO_ASY_ANALYSIS_DATA_IDX', schema: 'BIOMART'
		id generator: 'sequence', params: [sequence: 'SEQ_BIO_DATA_ID'], column: 'BIO_ASY_ANALYSIS_DATA_IDX_ID'
		version false
	}

	List getValues() {
		[ext_type, field_name, field_idx, display_idx]
	}
}
